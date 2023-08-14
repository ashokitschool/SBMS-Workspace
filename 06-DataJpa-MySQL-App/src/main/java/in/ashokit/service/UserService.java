package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.UserMasterEntity;
import in.ashokit.repos.UserMasterRepo;

@Service
public class UserService {

	@Autowired
	private UserMasterRepo userMasterRepo;
	
	public void testCustomQueries() {
		/*
		 * List<String> emails = userMasterRepo.getInidansEmails("INDIA");
		 * emails.forEach(email -> { System.out.println(email); });
		 */
		
		// userMasterRepo.updateAgeById(32,201);
		
		userMasterRepo.deleteUserById(201);
	}
	
	
	public void testFindByMethods() {
		
		//List<UserMasterEntity> entities = userMasterRepo.findByCity("USA");
		
		// List<UserMasterEntity> entities = userMasterRepo.findByAgeGreaterThanEqual(25);
		
		//List<UserMasterEntity> entities = userMasterRepo.findByGender("Male");
		
		//List<UserMasterEntity> entities = userMasterRepo.findByGenderAndCity("Male","INDIA");
		
		/*
		entities.forEach(entity -> {
			System.out.println(entity);
		});
		*/
		
		
	}
	
	

	public void test() {
		System.out.println("Total Records Count :: " + userMasterRepo.count());
		System.out.println("Record Presence ? :" + userMasterRepo.existsById(101));
	}

	public void deleteUser() {
		userMasterRepo.deleteById(1000);

		userMasterRepo.deleteAllById(Arrays.asList(103, 104));

		userMasterRepo.deleteAll();
	}

	public void getUser() {
		// select * from table where pk_column = :id
		Optional<UserMasterEntity> findById = userMasterRepo.findById(209);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		} else {
			System.out.println("No Record Present");
		}
	}

	public void getUsers() {
		List<Integer> ids = Arrays.asList(101, 102, 201, 202, 301, 302);

		Iterable<UserMasterEntity> entities = userMasterRepo.findAllById(ids);

		// Iterable<UserMasterEntity> entities = userMasterRepo.findAll();

		entities.forEach(e -> {
			System.out.println(e);
		});

	}

	public void saveUser() {

		// setting data for entity obj
		UserMasterEntity entity = new UserMasterEntity();
		entity.setId(104);
		entity.setName("Rani");
		entity.setEmail("rani@gmail.com");
		entity.setGender("Fe-Male");
		entity.setCity("INDIA");
		entity.setAge(16);

		// UPSERT method (UPDATE + INSERT)
		userMasterRepo.save(entity);

		System.out.println("Done.............");
	}

	public void saveUsers() {

		// setting data for entity obj
		UserMasterEntity entity1 = new UserMasterEntity();
		entity1.setId(201);
		entity1.setName("Ashok");
		entity1.setEmail("ashok@gmail.com");
		entity1.setGender("Male");
		entity1.setCity("INDIA");
		entity1.setAge(28);

		// setting data for entity obj
		UserMasterEntity entity2 = new UserMasterEntity();
		entity2.setId(202);
		entity2.setName("Mahesh");
		entity2.setEmail("mahesh@gmail.com");
		entity2.setGender("Male");
		entity2.setCity("INDIA");
		entity2.setAge(38);

		List<UserMasterEntity> entitiesList = Arrays.asList(entity1, entity2);

		userMasterRepo.saveAll(entitiesList);

		System.out.println("Done.............");
	}

}
