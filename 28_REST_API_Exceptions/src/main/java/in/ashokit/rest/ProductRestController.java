package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.ProductNotFoundException;

@RestController
public class ProductRestController {
	
	@GetMapping("/product/{pid}")
	public String getProductInfo(@PathVariable Integer pid) {
		
		if( pid > 100) {
			throw new ProductNotFoundException("Invalid Product ID");
		}
		return "Keyboard - 2500 INR";
	}
}
