package one.innovation.PersonApi.repositories;

import one.innovation.PersonApi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}