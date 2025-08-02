package com.shiv.simpleWebApp.controller;

import com.shiv.simpleWebApp.model.Product;
import com.shiv.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //public String getProducts(){
        //return "";//we need products from db so dnt have db ,create a temporary db using class i.e product.
        //nd for riting business logic v use service
@Autowired
ProductService service;

@RequestMapping("/products")
        public List<Product> getProducts(){
            return service.getProducts();
        }
    }


