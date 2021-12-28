package com.eshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
