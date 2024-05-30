package uk.co.argon.cdm.sports;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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

@Entity
@Table(name = "PLAYER_ATTRIBUTES")
public class Attribute {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long attributeId;
	private Long playerId;
	@NotBlank
	private String attribute;
	@Min(0)
	@Max(99)
	private int rating;
	
	
	
	public Attribute() {
	}
	
	public Attribute(Long playerId, String attribute, int rating) {
		this.playerId = playerId;
		this.attribute = attribute;
		this.rating = rating;
	}
	
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Long getAttirbuteId() {
		return attributeId;
	}

	public void setAttirbuteId(Long attirbuteId) {
		this.attributeId = attirbuteId;
	}

	/*public Long getPlayerId() {
		return playerId;
	}*/

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
}
