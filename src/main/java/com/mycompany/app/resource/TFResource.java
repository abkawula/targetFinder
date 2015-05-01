package com.mycompany.app.resource;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;
import com.mycompany.app.core.EventParameters;
import com.mycompany.app.core.EventParameters.EventParameterBuilder;
import com.mycompany.app.service.EventService;

@Path("event")
@Produces(MediaType.APPLICATION_JSON)
public class TFResource {

	private final EventService eventService;
	
	public TFResource(EventService eventService) {
		this.eventService = eventService;
	}
	
	
	@GET
	@Timed
	public Response getEvent(@QueryParam("zip") String zip) {
		EventParameterBuilder epb = new EventParameterBuilder().withZip(zip);
		return Response.status(Response.Status.OK)
				.entity(eventService.findEvents(new EventParameters(epb))).build();
	}
	
}
