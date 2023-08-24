package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductsService {

	private ProductRepo productRepo;

	public ProductsService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	public void getProducts() {
		
		List<Product> allProducts = productRepo.getAllProducts();
		
		allProducts.forEach(p -> {
			System.out.println(p);
		});
	}
}
