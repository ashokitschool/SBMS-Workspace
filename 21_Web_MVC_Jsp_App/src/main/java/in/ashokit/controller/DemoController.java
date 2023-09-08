package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2")
public class DemoController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg","Welcome to Ashok IT (demo)..!!");
		
		return "index";
	}

	@GetMapping("/login")
	public String login() {

		boolean isCredentialsValid = true;

		if (isCredentialsValid) {
			return "redirect:/dashboard?id=101";
		} else {
			return "index";
		}
	}
}
