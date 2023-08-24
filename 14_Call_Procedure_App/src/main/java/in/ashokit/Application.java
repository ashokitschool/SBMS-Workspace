package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		ProductsService service = context.getBean(ProductsService.class);
		
		service.getProducts();
	}

}
