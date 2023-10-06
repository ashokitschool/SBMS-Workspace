package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		int i = 10 / 0;

		return "Welcome to Ashok IT";
	}
}
