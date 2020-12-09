package tdt4250.project.loader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import TDT4250.Project.league.Booking;
import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Match;
import TDT4250.Project.league.Matchweek;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Standing;
import TDT4250.Project.league.Team;
import tdt4250.project.loader.data.CompetitionData;
import tdt4250.project.loader.data.json.TeamData;
import tdt4250.project.loader.jsondata.MatchJson;
import tdt4250.project.loader.jsondata.MatchWeekJson;
import tdt4250.project.loader.jsondata.MatchesJson;
import tdt4250.project.loader.jsondata.StandingJson;
import tdt4250.project.loader.jsondata.TeamJson;

/**
 * Maps data from the API to model instances that can be exported as .xmi
 */
public class ModelMapper {

	private CompetitionData competitionData;
	private League league;

	public ModelMapper(CompetitionData data) {
		league = getLeagueFactory().createLeague();
		competitionData = data;
	}

	public League mapLeague() {
		league.setName(competitionData.competitionJson.name);

		league.getTeams().addAll(mapTeams());
		league.getSeason().add(mapCurrentSeason());
		
		return league;
	}

	private List<Team> mapTeams() {
		List<Team> teams = new ArrayList<>();

		for (TeamJson t : competitionData.teamsJson.teams) {
			Team team = getLeagueFactory().createTeam();

			team.setName(t.name);
			team.setAbbr(t.tla);
			team.setStadium(t.venue);
			teams.add(team);
		}

		return teams;
	}
	
	

	private Season mapCurrentSeason() {
		Season season = getLeagueFactory().createSeason();
		String startDate = competitionData.competitionJson.currentSeason.startDate;

		// API date is YYYY-MM-DD, but we define seasons by starting year, so strip the rest
		String seasonStartingYear =  startDate.substring(0, 4);
		season.setName(seasonStartingYear);

		season.getStanding().addAll(mapStandings());
		season.getMatchweeks().addAll(mapMatchweeks());
		
		return season;
	}


	private List<Standing> mapStandings() {
		List<Standing> standings = new ArrayList<>();

		for (StandingJson s :  competitionData.standingsJson.standings) {
			Standing standing = getLeagueFactory().createStanding();
			standing.setPosition(s.position);
			standing.setGamesPlayed(s.playedGames);

			standing.setWins(s.won);
			standing.setDraws(s.draw);
			standing.setLoose(s.lost);
			standing.setPoints(s.points);
			standing.setGoalsFor(s.goalsFor);
			standing.setGoalsAgainst(s.goalsAgainst);
			standing.setGoalDifference(s.goalsDifference);

			Team team = getTeam(s.team.name);

			standing.setTeam(team);

			standings.add(standing);
		}

		return standings;
	}
	
	
    private List<Matchweek> mapMatchweeks() {
        HashMap<Integer, Matchweek> matchweekMap = new HashMap<>();
  
        for (MatchJson mj: competitionData.matchesJson.matches) {
            Match match = mapMatch(mj);
 
            int matchWeek = mj.matchday;
            
            if(!matchweekMap.containsKey(matchWeek)){
            	Matchweek mWeek = getLeagueFactory().createMatchweek(); 
            	mWeek.setMatchweek(matchWeek);
            	matchweekMap.put(matchWeek, mWeek);
            }
            matchweekMap.get(matchWeek).getMatches().add(match);

        }
        System.out.println(new ArrayList<Matchweek>(matchweekMap.values()));
        return new ArrayList<Matchweek>(matchweekMap.values());
        		
 
    }
	
	private Match mapMatch(MatchJson matchJson) {
		
		Match match = getLeagueFactory().createMatch();
		
	
		match.setHometeam(getTeam(matchJson.homeTeam.name));
		match.setAwayteam(getTeam(matchJson.awayTeam.name));
		match.setDate(matchJson.utcDate);
		if(!matchJson.referees.isEmpty()) {
			match.setReferee(matchJson.referees.get(0).name);
		}
		if(matchJson.status.equals("FINISHED")) {
			int homeGoals = Integer.parseInt(matchJson.score.homeTeam);
			int awayGoals = Integer.parseInt(matchJson.score.awayTeam);
			match.setHomegoals(homeGoals);
			match.setAvaygoals(awayGoals);
		}
		
		return match;
	}



	/**
	 * Get a team by name.
	 *
	 * This method has to be used after League has been populated using mapTeams()
	 *
	 * @param teamName
	 * @return team, or null.
	 */
	private Team getTeam(String teamName) {
		return league.getTeams().stream().filter(t -> t.getName().equals(teamName)).findFirst().get();
	}


	
	
	private static LeagueFactory leagueFactory;
	private static LeagueFactory getLeagueFactory() {
		if (leagueFactory == null) {
			LeaguePackage.eINSTANCE.eClass(); // Initialize the LeaguePackage singleton
			leagueFactory = LeagueFactory.eINSTANCE;
		}

		return leagueFactory;
	}
}
