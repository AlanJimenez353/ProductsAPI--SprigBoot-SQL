 package com.database.products.service;

import com.database.products.model.Product;
import com.database.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        product.setId(id);
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Product product, Long id) {
        product.setId(id);
        repository.delete(product);
    }

    @Override
    public Product getProductByName(String name) {
        return repository.findBynombre(name);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList =  new ArrayList<>();
        repository.findAll().forEach(productList::add);
        return productList;
    }

}
