package com.example.webproduct.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webproduct.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
