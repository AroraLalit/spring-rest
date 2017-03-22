package com.agrunditech.test.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {
	
	private String teamName;
	private String teamLocation;
	private String teamMascot;
	
	public Team() {
		super();
	}
	
	public Team(String teamName, String teamLocation, String teamMascot) {
		super();
		this.teamName = teamName;
		this.teamLocation = teamLocation;
		this.teamMascot = teamMascot;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamLocation() {
		return teamLocation;
	}
	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}
	public String getTeamMascot() {
		return teamMascot;
	}
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamLocation=" + teamLocation + ", teamMascot=" + teamMascot + "]";
	}
	
}
