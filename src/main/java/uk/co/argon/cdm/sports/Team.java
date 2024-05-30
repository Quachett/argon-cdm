package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "TEAM")
public class Team {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long teamId;
	private Long sportId;
	@NotBlank(message = "Team name must be provided")
	private String team;
	private String city;
	private String country;
	private int founded;
	private String manager;
	private String captain;
	private String league;
	private String stadium;
	@Transient
	//@NotBlank(message = "Sport type e.g. Football, must be provided")
	private String sport;
	@Transient
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinTable(
		name = "PLAYER",
		joinColumns = {@JoinColumn(name = "teamId")},
		inverseJoinColumns = { @JoinColumn(name = "playerId")}
	)
	private List<Player> squad;
	
	public Team() {
	}
	
	public Team(Long sportId, String team, String city, String country, int founded, String manager, String captain, String league, String stadium,
			String sport) {
		this.sportId = sportId;
		this.team = team;
		this.city = city;
		this.country = country;
		this.founded = founded;
		this.manager = manager;
		this.captain = captain;
		this.league = league;
		this.stadium = stadium;
		this.sport = sport;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getFounded() {
		return founded;
	}
	public void setFounded(int founded) {
		this.founded = founded;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public List<Player> getSquad() {
		if(squad == null)
			return new ArrayList<>();
		return squad;
	}
	public void setSquad(List<Player> squad) {
		this.squad = squad;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public Long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}
	
}
