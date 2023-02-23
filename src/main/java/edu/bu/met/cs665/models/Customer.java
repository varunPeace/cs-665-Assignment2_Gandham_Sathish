package edu.bu.met.cs665.models;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: this class define customer name and address
 */

public class Customer {

    private final String name;
    private final String address;

    // constructor for name and address
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // get customer name
    public String getName() {
        return name;
    }

    // get customer address
    public String getAddress() {
        return address;
    }
}
