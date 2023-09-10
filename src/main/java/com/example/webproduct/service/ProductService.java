package com.example.webproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webproduct.model.Product;
import com.example.webproduct.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }
    public List<Product> getProducts() {
        return repository.findAll();
    }
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    public String removeProduct(int id) {
        repository.deleteById(id);
        return "Product removed " + id;
    }
    public Product updateProduct(Product product, int id) {
        Product existingProduct = repository.findById(id).orElse(null);
        existingProduct.setImg(product.getImg());
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }
}
