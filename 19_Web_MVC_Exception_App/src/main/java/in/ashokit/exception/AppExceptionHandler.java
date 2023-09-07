package in.ashokit.exception;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNpe(NullPointerException ex, Model model) {

		System.out.println("first - method executed....");

		model.addAttribute("exRsn", ex.getMessage());
		model.addAttribute("date", LocalDateTime.now());

		return "error";
	}

	@ExceptionHandler(value = Exception.class)
	public String handleEx(Exception ex, Model model) {

		System.out.println("second method executed....");

		model.addAttribute("exRsn", ex.getMessage());
		model.addAttribute("date", LocalDateTime.now());

		return "error";
	}
}
