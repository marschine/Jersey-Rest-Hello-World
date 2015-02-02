package de.marrrschine.draftparser.draftparser_backend;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

import de.marrrschine.draftparser.draftparser_backend.Players;

@ApplicationPath("webapi")
public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		register(RequestContextFilter.class);
		register(Players.class);
		register(UtilClass.class);
	}

}
