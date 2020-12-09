package tdt4250.project.loader.jsondata;

import TDT4250.Project.league.PositionType;

public class PlayerJson {
	public int id;
	public String name;
	public String position;
	public String role;

	public static PositionType mapPosition(String position) {
		PositionType pos = null;

		switch(position) {
			case "Goalkeeper":
				pos =  PositionType.KEEPER;
				break;
			case "Defender":
				pos =  PositionType.DEFENCE;
				break;
			case "Attacker":
				pos =  PositionType.ATTACKER;
				break;
			case "Midfielder":
				pos =  PositionType.MIDFIELD;
				break;
		}

		return pos;
	}
}