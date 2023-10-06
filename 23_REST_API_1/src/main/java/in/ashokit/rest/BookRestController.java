package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

@RestController
public class BookRestController {

	
	@GetMapping(
			value="/book/{id}",
			produces = {
					"application/xml",
					"application/json"
			}
	)
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id){
		
		Book b = new Book(id, "Java", 2500.00);
		
		return new ResponseEntity<>(b, HttpStatus.OK);
	}
	

	@GetMapping(
			value="/books",
			produces = {
					"application/xml",
					"application/json"
			}
	)
	public ResponseEntity<List<Book>> getBooks() {

		Book b1 = new Book(501, "Java", 2500.00);
		Book b2 = new Book(502, "Python", 2500.00);
		Book b3 = new Book(503, "DevOps", 2500.00);

		List<Book> books = Arrays.asList(b1, b2, b3);

		return new ResponseEntity<>(books, HttpStatus.OK);//200
	}
	
	@PostMapping(
			value="/book",
			consumes = {
					"application/xml",
					"application/json"
			},
			produces = {
					"text/plain"
			}
	)
	public ResponseEntity<String> saveBook(@RequestBody Book book){
		
		System.out.println(book);
		
		// TODO : save to db
		
		return new ResponseEntity<>("Book Save", HttpStatus.CREATED);//201
	}
	
	@PutMapping(value="/book/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id, 
			@RequestBody Book book){
		
		System.out.println(book);
		
		// TODO : Update book in db
		
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id){
		
		System.out.println("Id To delete record:: "+ id);
		
		// TODO: DELETE Book in DB
		
		return new ResponseEntity<>("Record Deleted", HttpStatus.OK);
	}
}







