package com.mycompany.app;

import com.mycompany.app.resource.TFResource;
import com.mycompany.app.service.EventService;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class TFApplication extends Application<TFConfiguration> {

	@Override
	public void run(TFConfiguration configuration, Environment environment)
			throws Exception {
		final EventService eventService = new EventService();
		final TFResource tfResource = new TFResource(eventService);
		
		environment.jersey().register(tfResource);
	}
	
	public static void main(String[] args) throws Exception {
        new TFApplication().run(args);
    }


}
