package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to Ashok IT";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Morning..!!";
	}

}
