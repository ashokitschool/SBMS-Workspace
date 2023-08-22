package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
