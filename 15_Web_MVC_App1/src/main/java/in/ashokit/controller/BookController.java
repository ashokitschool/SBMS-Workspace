package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	public BookController() {
		System.out.println("BookController :: Constructor");
	}
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id", 101);
		mav.addObject("name", "Java");
		mav.addObject("price", 450.00);
		
		mav.setViewName("book-data");
		
		return mav;
	}
}





