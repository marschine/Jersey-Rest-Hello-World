package de.marrrschine.draftparser.draftparser_backend;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class MyApplication extends ResourceConfig {

	public MyApplication() {
		register(RequestContextFilter.class);
		register(PaymentService.class);
	}
}
