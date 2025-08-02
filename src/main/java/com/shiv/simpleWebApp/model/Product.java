package com.shiv.simpleWebApp.model;


//@Data //give etters nd setters.
//@AllArgsConstructor //create  a const for prodserv is feature of lombok.did not wprked so using the getters nd setters
public class Product {
    //we r using privte properties so shuld use getters&sett nd constructor so to make easy we use the lombok,which will make easy(in pom.xml configure) nd use the @data.
 private int prodId;
    private String prodName;
    private int prodPrice;

    public Product() {
    }

    public Product(int prodId) {
        this.prodId = prodId;
    }

    public Product(String prodName) {
        this.prodName = prodName;
    }

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice=prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getprodName() {
        return prodName;
    }

    public void setprodName(String prodName) {
        this.prodName = prodName;
    }

    public int getprodPrice() {
        return prodPrice;
    }

    public void setprodPrice(int price) {
        this.prodPrice =prodPrice;
    }
}
