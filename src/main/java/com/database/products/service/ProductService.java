package com.database.products.service;

import com.database.products.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    void deleteProduct(Product product, Long id);

    // Find
    Product getProductById(Long id);
    Product getProductByName(String name);
    List<Product> findAll();

    Product updateProduct(Product product, Long id);

}
