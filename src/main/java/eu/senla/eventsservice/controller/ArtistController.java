package eu.senla.eventsservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtistController {

    @GetMapping("artists")
    public String getArtistsPage() {

        return "artists";
    }

}
