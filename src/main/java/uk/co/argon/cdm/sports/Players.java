package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

public class Players {

	private List<Player> players;

	public List<Player> getPlayers() {
		if(players == null)
			return new ArrayList<>();
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
