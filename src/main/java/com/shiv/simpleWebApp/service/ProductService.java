package com.shiv.simpleWebApp.service;

import com.shiv.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;
@Service    //just like component  creates obj but for diff case
public class ProductService {


    List<Product> products= Arrays.asList(new Product(101,"Iphone",50000),
    new Product(102,"Samsung",10000),
new Product(103,"oneplus",2500));
    public List<Product> getProducts(){
        return products;
    }
}
