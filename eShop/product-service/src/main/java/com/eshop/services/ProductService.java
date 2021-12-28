package com.eshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.entities.Product;
import com.eshop.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(int productId){
		return productRepo.findById(productId);
	}
	
	public Product saveProduct(Product product){
		return productRepo.save(product);
	}	
}	
