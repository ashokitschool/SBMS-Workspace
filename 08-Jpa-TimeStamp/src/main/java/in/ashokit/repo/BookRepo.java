package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.Book;
import jakarta.transaction.Transactional;

public interface BookRepo extends JpaRepository<Book, Integer> {

	@Transactional
	@Modifying
	@Query("update Book set bookPrice=:price where bookId=:id")
	public void updateBook(Integer id, Double price);
}
