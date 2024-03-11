package com.matei.springboot101.services;

import com.matei.springboot101.repositories.ProductRepository;
import com.matei.springboot101.repositories.ProductRepositoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepositoryDB productRepositoryDB;
    public void addProductDB(String name, double price){
        productRepositoryDB.addProductDB(name, price);
    }

}
