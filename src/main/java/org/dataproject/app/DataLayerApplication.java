package org.dataproject.app;

import java.util.ArrayList;

import org.dataproject.app.model.Product;
import org.dataproject.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataLayerApplication implements CommandLineRunner {
	
	@Autowired
	private ProductService ps;

	public static void main(String[] args) {
		SpringApplication.run(DataLayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ArrayList<Product> allProducts = ps.getAllProducts();
		allProducts.forEach(product -> System.out.println(product.getName()));
		
	}

}
