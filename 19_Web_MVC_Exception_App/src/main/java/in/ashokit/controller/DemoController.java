package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {

		model.addAttribute("msg", "Welcome to Ashok IT");

		int i = 10 / 0;

		return "index";
	}
}
