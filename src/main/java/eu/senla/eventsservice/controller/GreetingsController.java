package eu.senla.eventsservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingsController {

    @GetMapping()
    public String getAllEvents(Model model) {
        return "index";
    }

}
