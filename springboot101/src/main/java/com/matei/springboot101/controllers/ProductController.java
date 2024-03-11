package com.matei.springboot101.controllers;

import com.matei.springboot101.entities.Product;
import com.matei.springboot101.repositories.ProductRepository;
import com.matei.springboot101.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product p){
        productRepository.save(p);
    }

    @GetMapping("/get/{name}")
    public Product getProduct(@PathVariable String name){
        return productRepository.findProductByName(name);
    }

    @PostMapping("/addDB/{name}/{price}")
    public void addProductDB(@PathVariable String name,
                             @PathVariable double price){
        productService.addProductDB(name, price);

    }

}
