package com.eshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.entities.Customer;
import com.eshop.pojo.MyOrders;
import com.eshop.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@GetMapping("/myorders/{cid}")
	public MyOrders myPurchases(@PathVariable("cid") int custId) {
		return customerService.getMyOrders(custId);
	}

}
