package uk.co.argon.cdm.sports;

import java.util.ArrayList;
import java.util.List;

public class Attributes {
	
	List<Attribute> attributes;

	public List<Attribute> getAttributes() {
		if(attributes == null)
			return new ArrayList<>();
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
}
