package com.matei.springboot101.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryDB {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProductDB(String name, double price){
        String sql = "INSERT INTO product VALUES  (NULL, ?, ?)";
        jdbcTemplate.update(sql, name, price);
    }

    public List<String> getProductNamesTest() {
        return Arrays.asList("aa","bbb","ccccc","dddd");
    }

    public void addProductTest(String name){

    }

}
