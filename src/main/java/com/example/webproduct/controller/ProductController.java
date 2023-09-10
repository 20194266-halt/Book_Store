package com.example.webproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webproduct.model.Product;
import com.example.webproduct.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        System.out.println(id);
        return service.getProductById(id);
    }
    @PutMapping(value="/update/{id}")
    public Product putMethodName( @RequestBody Product product, @PathVariable int id) {
        return service.updateProduct(product, id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.removeProduct(id);
    }
    
}
