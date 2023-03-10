package com.example.spring_mvc.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {
    List<Product> products = Arrays.asList(new Product(0, "Banana", 10), new Product(1, "Apple", 11),
            new Product(2, "Orange", 15));

    public List<Product> getList() {
        return products;
    }
}