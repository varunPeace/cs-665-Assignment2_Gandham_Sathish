package edu.bu.met.cs665.models;

import edu.bu.met.cs665.utils.VanType;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: this class define minivan driver
 */

public class VanDriver extends BaseDriver{

    private final VanType type;

    public VanDriver(VanType type) {
        this.type = type;
    }

}
