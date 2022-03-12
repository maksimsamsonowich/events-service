package eu.senla.eventsservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketsController {

    @GetMapping("/tickets")
    public String getAccountPage(Model model) {

        return "tickets";
    }

    public String submitTicketBuy(Long eventId, String customerName) {
        return null;
    }

}
