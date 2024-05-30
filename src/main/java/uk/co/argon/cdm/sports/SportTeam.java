package uk.co.argon.cdm.sports;

public class SportTeam {
	private Long team_id;
	private String team;
	
	public SportTeam() {
	}
	public SportTeam(Long team_id, String team) {
		this.team_id = team_id;
		this.team = team;
	}
	public Long getTeam_id() {
		return team_id;
	}
	public void setTeam_id(Long team_id) {
		this.team_id = team_id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
