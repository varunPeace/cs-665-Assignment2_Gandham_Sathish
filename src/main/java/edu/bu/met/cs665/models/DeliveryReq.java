package edu.bu.met.cs665.models;

import static edu.bu.met.cs665.utils.DeliveryDetail.PRODUCT;
import static edu.bu.met.cs665.utils.DeliveryDetail.ADDRESS;
import static edu.bu.met.cs665.utils.DeliveryDetail.CUSTOMER;
import static edu.bu.met.cs665.utils.DeliveryDetail.COMMA;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: this class define request details for the delivery
 */

public class DeliveryReq {

    private final String requestDetail;

    // constructor to initialize delivery request
    public DeliveryReq(Product product, Customer customer) {
        requestDetail = PRODUCT + product.getProductName() + COMMA + CUSTOMER + customer.getName() + COMMA + ADDRESS + customer.getAddress();
    }
    // method to get request delivery details
    public String getRequestDetail() {
        return requestDetail;
    }
}
