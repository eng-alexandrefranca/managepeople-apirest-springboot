package one.digitalinnovation.managepeople.managepeopleapi.repository;


//one.digitalinnovation.managepeople.managepeopleapi.
import one.digitalinnovation.managepeople.managepeopleapi.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}