package edu.bu.met.cs665.models;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: this class represents product
 */

public class Product {

    private final String name;

    public Product(String name) {
        this.name = name;
    }
    
    // get product name
    public String getProductName() {
        return name;
    }
}
