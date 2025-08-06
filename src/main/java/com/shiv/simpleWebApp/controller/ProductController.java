package com.shiv.simpleWebApp.controller;

import com.shiv.simpleWebApp.model.Product;
import com.shiv.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    //public String getProducts(){
    //return "";//we need products from db so dnt have db ,create a temporary db using class i.e product.
    //nd for riting business logic v use service
    @Autowired
    ProductService service;

    //@RequesMapping("/products") cam use but its efficient to use for get nd recognised easily
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    //1.for acepting the req for specif id
//@RequesttMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")             //acepting the path from path variabl
    public Product getProductById(@PathVariable int prodId) {  ///pathvar-accepting the value of prodid
        return service.getProductbyId(prodId);
    }

    //2.forr put the data
    //@RequestMapping ("/products") the name products is same it get confused but we can use the postannoation.
    @PostMapping("/products")

    //public void addProduct(Product prod) { wat we r giving is not received by the server side nd to achieve that we use annotation @requestBody-matches the data and put that data in the product thing .
        public void addProduct (@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
        }

        //3.updating the values
    @PutMapping("/products")
        public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        }
//4.deleting the value
    @DeleteMapping("/products/{prodId}")
public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
    }



