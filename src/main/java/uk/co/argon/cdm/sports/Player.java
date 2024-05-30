package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "PLAYER")
public class Player {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playerId;
	private Long teamId;
	private Long sportId;
	@NotBlank
	private String name;
	@Min(15)
	@Max(45)
	private int age;
	@Min(0)
	@Max(99)
	private int squadNo;
	@Min(0)
	@Max(99)
	private int rating;
	@Enumerated(EnumType.STRING)
	private Position position;
	private String nation;
	@Transient
	@NotBlank
	private String team;
	@Transient
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinTable(
		name = "ATTRIBUTE",
		joinColumns = {@JoinColumn(name = "palyerId")},
		inverseJoinColumns = { @JoinColumn(name = "attributeId")}
	)
	private List<Attribute> attributes;
	
	public Player() {
	}
	
	public Player(Long teamId, Long sportId, String name, int age, int squadNo, int rating, Position position, String nation,
			String team, List<Attribute> attributes) {
		this.teamId = teamId;
		this.sportId = sportId;
		this.name = name;
		this.age = age;
		this.squadNo = squadNo;
		this.rating = rating;
		this.position = position;
		this.nation = nation;
		this.team = team;
		this.attributes = attributes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSquadNo() {
		return squadNo;
	}
	public void setSquadNo(int squadNo) {
		this.squadNo = squadNo;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public List<Attribute> getAttributes() {
		if(attributes == null)
			return new ArrayList<>();
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}

}
