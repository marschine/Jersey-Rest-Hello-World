package de.marrrschine.draftparser.draftparser_backend;

import org.springframework.stereotype.Component;

@Component
public class UtilClass {

	private String utilstring = "utilclass string";

	public String getUtilstring() {
		return utilstring;
	}

	public void setUtilstring(String utilstring) {
		this.utilstring = utilstring;
	}
	
}
