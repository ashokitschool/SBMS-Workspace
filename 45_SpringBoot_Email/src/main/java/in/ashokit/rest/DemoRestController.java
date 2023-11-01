package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.EmailUtils;

@RestController
public class DemoRestController {

	@Autowired
	private EmailUtils emailUtils;

	@GetMapping("/email")
	public String sendEmail() {
		
		emailUtils.sendEmail();
		
		return "Email Sent successfully";
	}
}
