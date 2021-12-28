package com.eshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}
