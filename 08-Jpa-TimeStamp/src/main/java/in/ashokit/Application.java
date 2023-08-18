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

		Book book = bookRepo.findById(1).get();
		book.setActiveSw("N");
		
		bookRepo.save(book);
		

		System.out.println("Done................");
	}
}
