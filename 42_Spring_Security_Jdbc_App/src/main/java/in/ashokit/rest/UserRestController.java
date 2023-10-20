package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(value = "/admin")
	public String admin() {
		return "Welcome Admin :)";
	}

	@GetMapping(value = "/user")
	public String user() {
		return "Hello User :)";
	}

	@GetMapping(value = "/")
	public String welcome() {
		return "Welcome :)";
	}

}
