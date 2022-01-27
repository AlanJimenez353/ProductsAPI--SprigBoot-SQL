package com.database.products.repository;


import com.database.products.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findBynombre(String nombre);

}

