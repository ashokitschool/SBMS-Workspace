package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome To Ashok IT";
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg() {
		return new ResponseEntity<>("Good Morning", HttpStatus.OK);
	}
}
