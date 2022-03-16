package eu.senla.eventsservice.service.impl;

import eu.senla.eventsservice.model.Event;
import eu.senla.eventsservice.model.Ticket;
import eu.senla.eventsservice.model.User;
import eu.senla.eventsservice.repositry.EventRepository;
import eu.senla.eventsservice.repositry.TicketRepository;
import eu.senla.eventsservice.repositry.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final EventRepository eventRepository;

    private final UserRepository userRepository;

    private final TicketRepository ticketRepository;

    public void orderAnTicket(String event, String customerName, Integer count) {

        Event currentEvent = eventRepository.getEventByTitle(event).stream().findFirst().orElse(null);

        if (Objects.isNull(currentEvent))
            throw new RuntimeException("There is no such event.");

        String[] info = customerName.split(" ");

        if (info.length == 1)
            throw new RuntimeException("Something went wrong");

        User user = userRepository.findUserByFirstNameAndSurname(info[0], info[1]);

        if (Objects.isNull(user)) {
            user = userRepository.save(new User().setFirstName(info[0]).setSurname(info[1])
                    .setPhoneNumber(null));
        }
        Calendar calendar = Calendar.getInstance();
        Ticket currentTicket = new Ticket()
                .setOrderDate(calendar.getTime())
                .setOwner(user);

        if (currentEvent.getOccupiedPlace() + count <= 100) {
            currentEvent.setOccupiedPlace((short) (currentEvent.getOccupiedPlace() + count));
            Event current = eventRepository.save(currentEvent);
            currentTicket.setEventHolding(current);
        } else {
            throw new RuntimeException("You trying to buy too much tickets.");
        }

        ticketRepository.save(currentTicket);

        throw new RuntimeException("Success!");
    }
}
