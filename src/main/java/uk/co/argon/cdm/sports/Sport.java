package uk.co.argon.cdm.sports;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SPORT")
public class Sport {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sportId;
	private String sport;
	
	public Sport() {
	}
	
	public Sport(String sport) {
		this.sport = sport;
	}
	public Long sportId() {
		return sportId;
	}
	public void sportId(Long sportId) {
		this.sportId = sportId;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
}
