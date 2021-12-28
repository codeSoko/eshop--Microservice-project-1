package com.eshop.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.entities.Product;
import com.eshop.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	//get all product details
	@GetMapping("/")
	public List<Product> getproducts(){
		return productService.getAllProducts();
	}
	
	//save the product
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product p){
		return productService.saveProduct(p);
	}
	
	//get product details by Id
	@GetMapping("{id}")
	public Optional<Product> getProductById(@PathVariable("id") int pid) {
		return productService.getProductById(pid);
	}

}
