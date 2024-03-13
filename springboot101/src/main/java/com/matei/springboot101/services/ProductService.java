package com.matei.springboot101.services;

import com.matei.springboot101.repositories.ProductRepository;
import com.matei.springboot101.repositories.ProductRepositoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepositoryDB productRepositoryDB;
    public void addProductDB(String name, double price){
        productRepositoryDB.addProductDB(name, price);
    }

    public List<String> getProductNamesWithEvenNoOfCharactersTest(){
        List<String> names = productRepositoryDB.getProductNamesTest();
        return names.stream()
                .filter(n -> n.length() % 2 == 0)
                .collect(Collectors.toList());

//        List<String> result = new ArrayList<>();
//
//        for ( String n : names ){
//            if (n.length() % 2  == 0){
//                result.add(n);
//                productRepositoryDB.addProductTest(n);
//            }
//        }
//        return result;
    }

}
