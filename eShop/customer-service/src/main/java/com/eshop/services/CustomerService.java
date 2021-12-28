package com.eshop.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eshop.entities.Customer;
import com.eshop.pojo.MyOrders;
import com.eshop.pojo.Product;
import com.eshop.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	//Customer can save details
	public Customer saveCustomer(Customer cust) {
		return customerRepo.save(cust);
	}
	
	//Customer can get and view his orders based on Customer Id
	public MyOrders getMyOrders(int custId) {
		Optional<Customer> customer=customerRepo.findById(custId);
		int pid=customer.get().getProductId();
		//to get order details call product-service
		Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/product/"+pid, Product.class);
		MyOrders myOrders=new MyOrders();
		myOrders.setCustomer(customer.get());
		myOrders.setProduct(product);
		return myOrders;
	}
}
