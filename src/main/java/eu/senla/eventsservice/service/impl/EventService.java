package eu.senla.eventsservice.service.impl;

import eu.senla.eventsservice.exception.event.NoSuchEventException;
import eu.senla.eventsservice.model.Event;
import eu.senla.eventsservice.repositry.EventRepository;
import eu.senla.eventsservice.service.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService implements IEventService {

    private final EventRepository eventRepository;


    @Override
    public Event getEventById(Long id) {

        return eventRepository.findById(id)
                .orElseThrow(() -> new NoSuchEventException("No such event exception."));
    }

    @Override
    public List<Event> getAllEvents() {

        return eventRepository.findAll();
    }


}
