package com.shiv.simpleWebApp.service;

import com.shiv.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;
@Service    //just like component  creates obj but for diff case
public class ProductService {


    public List<Product> getProducts() {
        return products;
    }

    // List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000),-it creates immutable list
    List<Product> products = new ArrayList<>(Arrays.asList(   //cretaes mutable list
            new Product(101, "Iphone", 50000),
            // List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102, "Samsung", 10000),
            new Product(103, "oneplus", 2500)));

    //1.
    public Product getProductbyId(int prodId) {
        return products.stream()//for filtering the data we use streams api
                .filter(p -> p.getProdId() == prodId)
                //.findFirst().get();
                .findFirst().orElse(new Product(100, "NoItem", 0)); //if the unkonwn id it peints this and we use this.    }
    }

    //2.for adding the products its in the server side
    public void addProduct(Product prod) {
        products.add(prod);
    }

    //for updating the value
    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;

        products.set(index, prod);
    }
    //4.deleting the values
    public void deleteProduct(int prodId){
        int index=0;

        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prodId)
                index=1;

        products.remove(index);
    }
}
