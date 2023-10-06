package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.ashokit.entitiy.Book;

@RepositoryRestResource(path="books")
public interface BookRepository extends JpaRepository<Book, Integer>{

}
