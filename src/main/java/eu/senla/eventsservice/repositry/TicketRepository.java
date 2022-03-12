package eu.senla.eventsservice.repositry;

import eu.senla.eventsservice.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
