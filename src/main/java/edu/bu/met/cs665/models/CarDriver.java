package edu.bu.met.cs665.models;
import edu.bu.met.cs665.utils.CarType;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: this class define car driver
 */

public class CarDriver extends BaseDriver{

    private final CarType type;

    public CarDriver(CarType type) {
        this.type = type;
    }
}
