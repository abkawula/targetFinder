package com.mycompany.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mycompany.app.core.Event;
import com.mycompany.app.core.EventParameters;
import com.mycompany.app.core.Location;

public class EventService {

	public List<Event> findEvents(EventParameters ep) {
		Location dl1 = new Location();
		dl1.setName("Adam's House");
		dl1.setAddress("20404 Treyburn Ln");
		dl1.setCity("Pflugerville");
		dl1.setState("TX");
		dl1.setZip("78660");
		dl1.setLatitude(30.481912);
		dl1.setLongitude(-97.572462);
		
		Location dl2 = new Location();
		dl2.setName("PFSC");
		dl2.setAddress("1009 Pigeon Forge Dr");
		dl2.setCity("Pflugerville");
		dl2.setState("TX");
		dl2.setZip("78660");
		dl2.setLatitude(30.4268241);
		dl2.setLongitude(-97.6191348);
		
		Event de1 = new Event();
		de1.setDate(new Date());
		de1.setLocation(dl1);
		de1.setName("Adam's first shootout");
		
		Event de2 = new Event();
		de2.setDate(new Date());
		de2.setLocation(dl1);
		de2.setName("Adam's second shootout");
		
		Event de3 = new Event();
		de3.setDate(new Date());
		de3.setLocation(dl1);
		de3.setName("Phil's first shootout");
		
		Event de4 = new Event();
		de4.setDate(new Date());
		de4.setLocation(dl1);
		de4.setName("Phil's second shootout");
		
		List<Event> events = new ArrayList<Event>();
		events.add(de1);
		events.add(de2);
		events.add(de3);
		events.add(de4);
		
		return events;
	}
}
