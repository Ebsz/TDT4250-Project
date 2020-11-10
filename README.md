# TDT4250 - Advanced Software Design

Contributor: Vegard Sporstøl, Ralf Leistad, Øystein Bjørkend Haugen and Einar Sønju

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
    * [Case Description](#case-description)
* [Getting Started](#getting-started)
  * [Clone](#clone)
  * [Prerequisites](#prerequisites)
* [Repo Structure](#repo-structure)


<!-- ABOUT THE PROJECT -->
## About The Project

This project is done as a part of the NTNU course TDT4250 - Advanced Software Design

<!-- CASE DESCRIPTION -->
### Case Description

The semester project is the main part of the course work in the second half of the semester. 
This year the project counts 70%, while the three individuel assignment counts the remaining 30%. The project (and the last assignment) is due at the end of the semester. 
The semester project will focus on modelling, but since it requires making a usable artifact, it will also touch upon component-based design. 
You can work alone, but should work in groups of up to 4.

The general task is to build a DSL usable in Eclipse, using relevant frameworks including Xtext and Sirius, but also EMF Forms. 
It may also be relevant to include transformations.

You will have some freedom in the details, but here are two more specific suggestions you may consider:

Find a public or easily available data source with some volume of data and interesting level of complexity. 
Model the data using Ecore and implement an transformation facility so you can import, view and process the data using EMF. 
Then create a viewer and editor for the data using (preferably) Sirius or EMF Forms, that can be installed into Eclipse.
Find a kind of artifact, e.g. file format, preferably text-based, that is used within software development. 
Create an alternative textual syntax that is easier to use (read and write) and implement an Xtext-based editor for it, and an M2M or M2T transformation to the existing format.
Details of your project should be discussed with me, to ensure suitable relevance and scope (since the whole point is getting more experience and learn thing better).

Your project will be evaluated by cloning your repository, importing relevant Eclipse (bundle/plugin) projects and following a set of instructions provided in a README.md file for trying out your 'product'. The most relevant way of trying out your product is launching a second Eclipse with your bundles/plugins included and importing a project with sample data files to try your DSL (whether based on Sirius, EMF Forms or Xtext).

The submission itself should be a link to the repository where the project is. The repository needs to be accessible to me, so I can clone it, before importing the bundle project into Eclipse. There must be a README.md file in each bundle project, and one of them must include detailed instructions for how to try out your project, including what we need to install into Eclipse to be able to compile and launch, how to launch and what to do when launched, e.g. what actions to take and what to look for to see all the relevant features. It is very important that the instructions are precise and complete, because we don't want to waste time on configuration issues.

<!-- GETTING STARTED -->
## Getting Started

The following section will cover how to clone and build the project

<!-- CLONE -->
### Clone

The repo must be clone through git using this link: 

### Prerequisites
You need to have the latest versions of Java (8.0.261) and Eclipse (2020-06)

**The following plug-ins must be installed:**

From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category checked
* Acceleo - model to text transformation (M2T) and OCL interpreter view
* Ecore Diagram Editor (SDK) - editor for ecore models as diagram
* EMF Forms SDK - forms for ecore models
* Sirius Specifier Environment - diagram-based DSL framework
* Sirius Properties Views - Specifier Support
* Mylyn WikiText - editor for various wiki markup formats, including markdown

From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category un-checked:
* Acceleo Query SDK - OCL implementation

From the software site http://hallvard.github.io/plantuml (type into text field):
* PlantUML Ecore Feature and PlantUML Feature (under PlantUML Eclipse support)
* PlantUML Library Feature (under PlantUML Library)

In addition, install the graphviz command line application and register its path to dot executable in the PlantUML preferences in Eclipse. 
The Eclipse PlantUML plugin is incompatible with the latest graphviz version, so use v2.38.


<!-- Repo Structure -->
## Repo Structure
* TDT4250-Project.model
