package eu.senla.eventsservice.controller;

import eu.senla.eventsservice.service.impl.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class TicketsController {

    private final TicketService ticketService;

    @GetMapping("/tickets")
    public String getAccountPage(Model model) {

        return "tickets";
    }

    @GetMapping("/tickets/{event}")
    public String getTicketsPage(Model model, @PathVariable String event) {
        model.addAttribute("event", event);

        return "tickets";
    }

    @GetMapping("/tickets/{event}/{customerName}/{count}")
    public String submitTicketBuy(Model model,
                                  @PathVariable String event,
                                  @PathVariable String customerName,
                                  @PathVariable Integer count) {

        try {

            ticketService.orderAnTicket(event, customerName, count);

        } catch (RuntimeException exception) {
            model.addAttribute("message", exception.getMessage());
            return "error";
        }
        return "index";
    }

}
