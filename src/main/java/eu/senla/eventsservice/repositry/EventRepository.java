package eu.senla.eventsservice.repositry;

import eu.senla.eventsservice.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findAll();

}
