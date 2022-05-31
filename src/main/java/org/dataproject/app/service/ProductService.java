package org.dataproject.app.service;

import java.util.ArrayList;
import java.util.Optional;

import org.dataproject.app.model.Product;
import org.dataproject.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public ArrayList<Product> getAllProducts() {
		return (ArrayList<Product>) pr.findAll();
	}
	public Optional<Product> getProductById(Integer id) {
		return pr.findById(id);
	}
}
