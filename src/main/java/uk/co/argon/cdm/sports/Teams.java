package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

public class Teams {

	private List<Team> teams;

	public Teams() {
	}

	public Teams(List<Team> teams) {
		this.setTeams(teams);
	}

	public List<Team> getTeams() {
		if(teams == null)
			return new ArrayList<>();
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
}
