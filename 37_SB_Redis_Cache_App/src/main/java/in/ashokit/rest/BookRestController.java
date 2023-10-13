package in.ashokit.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Book;

@RestController
public class BookRestController {
	
	private HashOperations<String, Integer, Book> opsForHash = null;
	
	public BookRestController(RedisTemplate<String,Book> redisTemplate) {
		this.opsForHash = redisTemplate.opsForHash();
	}
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		
		opsForHash.put("books", book.getBookId(), book);
		
		return new ResponseEntity<>("Book Saved", HttpStatus.CREATED);
	}
	
	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") Integer bookId){
		
		Book book = opsForHash.get("books", bookId);
		
		return new ResponseEntity<>(book, HttpStatus.OK);
		
	}
	
	@GetMapping("/books")
	public ResponseEntity<Collection<Book>> getAllBooks(){
		
		Map<Integer, Book> entries = opsForHash.entries("books");
		
		Collection<Book> values = entries.values();
		
		return new ResponseEntity<>(values, HttpStatus.OK);
	}

}
