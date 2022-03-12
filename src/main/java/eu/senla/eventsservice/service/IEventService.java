package eu.senla.eventsservice.service;

import eu.senla.eventsservice.model.Event;

import java.util.List;

public interface IEventService {

    Event getEventById(Long id);

    List<Event> getAllEvents();

}
