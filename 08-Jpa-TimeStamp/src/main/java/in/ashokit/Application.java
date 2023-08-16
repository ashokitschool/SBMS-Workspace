package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Book;
import in.ashokit.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		BookRepo bookRepo = context.getBean(BookRepo.class);

		Book entity = new Book();
		entity.setBookName("Python");
		entity.setBookPrice(4500.50);

		bookRepo.save(entity);

		System.out.println("Done................");
	}
}
