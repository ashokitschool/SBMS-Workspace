package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
