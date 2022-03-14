package eu.senla.eventsservice.controller;

import eu.senla.eventsservice.service.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class EventController {

    private final IEventService iEventService;

    @GetMapping("events")
    public String getEventById(Model model) {
        model.addAttribute("events", iEventService.getAllEvents());

        return "events";
    }

}
