package eu.senla.eventsservice.controller;

import eu.senla.eventsservice.service.impl.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService artistService;

    @GetMapping("artists")
    public String getArtistsPage(Model model) {
        model.addAttribute("artists", artistService.getArtists());

        return "artists";
    }

}
