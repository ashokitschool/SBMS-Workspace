package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
