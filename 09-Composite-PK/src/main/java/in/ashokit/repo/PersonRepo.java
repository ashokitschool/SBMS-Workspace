package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Person;
import in.ashokit.entities.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK>{
	
}
