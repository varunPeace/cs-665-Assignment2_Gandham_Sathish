package edu.bu.met.cs665.models;

import edu.bu.met.cs665.interfaces.DeliveryBroadcast;
import edu.bu.met.cs665.interfaces.Observer;

import java.util.ArrayList;

/*
Author: Varunkumar G S
Email: gsv@bu.edu
Date: 02/23/2023
File Desc: interface to define observer pattern
 */

public class Shop implements DeliveryBroadcast {

    private String deliveryRequest;
    private final ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(deliveryRequest);
        }
    }

    public void setDeliveryRequest(DeliveryReq request){
        deliveryRequest = request.getRequestDetail();
        notifyObservers();
    }

}
