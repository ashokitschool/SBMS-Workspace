package in.ashokit.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.UserMasterEntity;
import jakarta.transaction.Transactional;

public interface UserMasterRepo extends CrudRepository<UserMasterEntity, Integer> {

	// select * from user_master where user_city = :city
	public List<UserMasterEntity> findByCity(String city);

	// select * from user_master where user_age >= :age
	public List<UserMasterEntity> findByAgeGreaterThanEqual(int age);

	// select * from user_master where user_gender = :gender
	public List<UserMasterEntity> findByGender(String gender);

	// select * from user_master where user_gender=:gender and user_city=:city
	public List<UserMasterEntity> findByGenderAndCity(String gender, String city);

	@Query("select email from UserMasterEntity where city = :city")
	public List<String> getInidansEmails(String city);

	@Query("from UserMasterEntity")
	public List<UserMasterEntity> getAllUsers();

	@Query(value = "select * from user_master", nativeQuery = true)
	public List<UserMasterEntity> getAllUsersSql();
	
	@Transactional
	@Modifying
	@Query("update UserMasterEntity set age = :age where id = :uid")
	public void updateAgeById(int age, int userid);	
	
	@Query("delete from UserMasterEntity where id = :uid")
	@Transactional
	@Modifying
	public void deleteUserById(int uid);
	
}
