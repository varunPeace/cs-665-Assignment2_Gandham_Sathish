package edu.bu.met.cs665.interfaces;

/*
Author: Ravi Bhayani
Email: rbhayani@bu.edu
Date: 10/03/2022
File Desc: interface to define subject in observer pattern
 */

public interface DeliveryBroadcast {

    // register an observer
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    // notify an observer
    void notifyObservers();

}
