package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Query(value = "call getProductsData()", nativeQuery = true)
	public List<Product> getAllProducts();

}
