package com.database.products.controller;

import com.database.products.model.Product;
import com.database.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/item")
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getproducts() {
        return service.findAll();
    }

    @GetMapping("/item/{id}")
    public Product getProductById(@RequestParam Long id){
        return service.getProductById(id);
    }
    @GetMapping("/item")
    public Product findByName(@RequestParam String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/item/{id}")
    public Product updateProductById(@PathVariable Long id, @RequestBody  Product product) {
        return service.updateProduct(product, id);
    }
    @DeleteMapping("/item/{id}")
    public void deleteProduct(@PathVariable long id,@RequestBody Product product)
    {
        service.deleteProduct(product,id);
    }

}
