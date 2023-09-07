package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	// Insert data

	public boolean saveUser(User user) {
		user = userRepo.save(user);
		return user.getUserId() > 0;
	}

	// retrieve data

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
