package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Passport;
import in.ashokit.entities.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public void saveData() {

		Person person = new Person();
		person.setPersonName("Ashok");
		person.setPersonGender("Male");

		Passport passport = new Passport();
		passport.setPassPortNum("KM797979");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		person.setPassport(passport);
		passport.setPerson(person);

		personRepo.save(person);

	}

	public void delete() {
		personRepo.deleteById(1);
	}

}
