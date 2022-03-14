package eu.senla.eventsservice.service.impl;

import eu.senla.eventsservice.model.Artist;
import eu.senla.eventsservice.repositry.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;

    public List<Artist> getArtists() {

        return artistRepository.findAll();
    }

}
