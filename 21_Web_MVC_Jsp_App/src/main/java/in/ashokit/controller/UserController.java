package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/login")
	public String login(HttpServletRequest req, Model model) {

		String name = req.getParameter("name");
		System.out.println("Name :: " + name);

		HttpSession session = req.getSession(true);
		session.setAttribute("name", name);

		model.addAttribute("msg", "User logged in (session created)");

		return "index";
	}

	@GetMapping("/dashboard")
	public String dashboard(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession(false);
		String name = (String) session.getAttribute("name");

		System.out.println("Name :: " + name);

		model.addAttribute("msg", name + ", welcome to our website...");

		return "index";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession();

		session.invalidate();

		model.addAttribute("msg", "User logged out successfully");

		return "index";
	}
}
