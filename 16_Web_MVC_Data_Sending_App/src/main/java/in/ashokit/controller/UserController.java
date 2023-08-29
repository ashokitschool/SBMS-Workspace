package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.User;

@Controller
public class UserController {

	@GetMapping("/users")
	public String getUsers(Model model) {

		User u1 = new User(101, "Ashok", "ashok@gmail.com");
		User u2 = new User(102, "Raju", "raju@gmail.com");
		User u3 = new User(103, "Rani", "rani@gmail.com");

		List<User> usersList = Arrays.asList(u1, u2, u3);

		model.addAttribute("usersData", usersList);

		return "view-users";
	}

	@GetMapping("/user")
	public String getUserData(Model model) {

		User userObj = new User(101, "Ashok", "ashokitschool@gmail.com");

		model.addAttribute("user", userObj);

		return "user-data";
	}

	@GetMapping("/email")
	public String getUserEmail(Model model) {

		model.addAttribute("data", "ashokitschool@gmail.com");

		return "index";
	}

	@GetMapping("/name")
	public ModelAndView getUserName() {
		ModelAndView mav = new ModelAndView();

		// set data to model
		mav.addObject("data", "Ashok");

		// set view name
		mav.setViewName("index");

		return mav;
	}
}
