package edu.bu.met.cs665.utils;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: enum class to define delivery details
 */

public enum DeliveryDetail {

    CUSTOMER ("Customer: "),
    PRODUCT ("Product: "),
    ADDRESS ("Address: "),
    COMMA (", ");

    private final String name;

    DeliveryDetail(String s){
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
