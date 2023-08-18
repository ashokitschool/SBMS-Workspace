package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Person;
import in.ashokit.entities.PersonPK;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	public void savePerson() {
		
		PersonPK pk = new PersonPK();
		pk.setAadhar(7866868689l);
		pk.setPassport("BMVPB20432");
		
		Person p= new Person();
		p.setName("Raju");
		p.setEmail("raju@gmail.com");
		p.setPersonPk(pk);
		
		personRepo.save(p);
		
	}
	
	
	public void getPerson() {
		
		PersonPK pk = new PersonPK();
		pk.setAadhar(7866868689l);
		pk.setPassport("BMVPB20432");
		
		Optional<Person> findById = personRepo.findById(pk);
		
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
}
