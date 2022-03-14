package eu.senla.eventsservice.repositry;

import eu.senla.eventsservice.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findAll();

}
