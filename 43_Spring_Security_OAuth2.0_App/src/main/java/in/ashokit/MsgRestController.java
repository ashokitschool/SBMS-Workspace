package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome to Ashok IT";
	}

}
