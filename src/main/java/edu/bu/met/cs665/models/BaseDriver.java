package edu.bu.met.cs665.models;

import edu.bu.met.cs665.interfaces.Observer;

import java.util.ArrayList;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: class that defines concrete observer in observer pattern
 */

public class BaseDriver implements Observer {

    private final ArrayList<String> requests = new ArrayList<>();

    // update request
    @Override
    public void update(String requestDetails) {
        requests.add(requestDetails);
    }

    // get latest request
    public String getLastRequest(){
        return requests.get(requests.size() - 1);
    }

}
