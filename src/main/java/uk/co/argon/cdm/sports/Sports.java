package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

public class Sports {

	List<Sport> sports;

	public Sports() {
	}

	public Sports(List<Sport> sports) {
		this.setSports(sports);
	}

	public List<Sport> getSports() {
		if(sports==null)
			return new ArrayList<>();
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
}
