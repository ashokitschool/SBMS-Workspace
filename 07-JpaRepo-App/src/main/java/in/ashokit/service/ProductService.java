package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	
	public void getProducts() {
		
		List<Product> records = productRepo.findAll(Sort.by("price"));
		
		records.forEach(record -> {
			System.out.println(record);
		});
	}

	public void saveProducts() {
		
		Product p1 = new Product(101, "Mouse", 500.50);
		Product p2 = new Product(102, "HDD", 4500.50);
		Product p3 = new Product(103, "Keyboard", 2500.50);
		Product p4 = new Product(104, "Monitor", 6000.50);
		Product p5 = new Product(105, "PC Table", 10000.50);
		Product p6 = new Product(106, "RAM", 8000.50);
		Product p7 = new Product(107, "AC", 45000.50);
		Product p8 = new Product(108, "TV", 65500.50);
		
		productRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));

	}

}
