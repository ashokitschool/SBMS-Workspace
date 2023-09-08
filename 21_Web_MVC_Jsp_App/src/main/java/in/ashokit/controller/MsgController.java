package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v1")
public class MsgController {
	
	@GetMapping("/dashboard")
	public String getDashboard(@RequestParam("id") Integer id, Model model) {

		System.out.println("Id :: "+id);
		
		model.addAttribute("msg", "Dashboard under construction....");

		return "index";
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg","Welcome to Ashok IT (msg)..!!");
		
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		model.addAttribute("msg","Good Morning..!!");
		
		return "index";
	}
}
