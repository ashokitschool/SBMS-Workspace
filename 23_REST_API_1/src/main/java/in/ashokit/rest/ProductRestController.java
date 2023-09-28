package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping("/product")
	public Product getProduct(@RequestParam("pid") Integer pid) {

		Product p = new Product(pid, "Mouse", 500.00);

		return p;
	}
}
