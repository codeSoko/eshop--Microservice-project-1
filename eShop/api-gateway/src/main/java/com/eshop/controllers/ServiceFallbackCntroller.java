package com.eshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackCntroller {

	@GetMapping("custService")
	public String custService() {
		return "customer-service is down";
	}

	@GetMapping("prodService")
	public String prodService() {
		return "product-service is down";
	}
}
	

