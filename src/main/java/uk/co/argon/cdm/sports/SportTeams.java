package uk.co.argon.cdm.sports;

import java.util.HashMap;
import java.util.Map;

public class SportTeams {
	Map<Long, String> teams;

	public SportTeams() {
	}

	public SportTeams(Map<Long, String> teams) {
		this.setTeams(teams);
	}

	public Map<Long, String> getTeams() {
		if(teams == null)
			teams = new HashMap<>();
		return teams;
	}

	public void setTeams(Map<Long, String> teams) {
		this.teams = teams;
	}
}
