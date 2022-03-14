package eu.senla.eventsservice.repositry;

import eu.senla.eventsservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByFirstNameAndSurname(String firstName, String surname);

}
