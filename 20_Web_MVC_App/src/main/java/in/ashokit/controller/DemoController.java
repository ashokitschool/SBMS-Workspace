package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Ashok IT");
		return "index";
	}

	@ResponseBody
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Morning..!!"; 
	}
}
