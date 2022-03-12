package eu.senla.eventsservice.repositry;

import eu.senla.eventsservice.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {



}
