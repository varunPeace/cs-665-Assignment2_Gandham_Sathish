package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.models.*;
import edu.bu.met.cs665.utils.CarType;
import edu.bu.met.cs665.utils.VanType;
import org.junit.Test;

/*
Author: Ravi Bhayani
Email: rbhayani@bu.edu
Date: 10/03/2022
File Desc: Test class
 */

public class DeliverySystemTest {

  @Test
  public void deliverySystemTest() {

    // defining customers
    Customer cOne = new Customer("Chris", "10 CommonWealth Ave.");
    Customer cTwo = new Customer("Steven", "1650 Washington Street.");
    Customer cThree = new Customer("Peter", "4 Haskell Street.");

    // defining product
    Product pOne = new Product("Printer");
    Product pTwo = new Product("Mattress");
    Product pThree = new Product("Study Table");

    // defining drivers
    CarDriver dOne = new CarDriver(CarType.SEDAN);
    VanDriver dTwo = new VanDriver(VanType.SMALL);
    CarDriver dThree = new CarDriver(CarType.SUV);
    VanDriver dFour = new VanDriver(VanType.LARGE);
    CarDriver dFive = new CarDriver(CarType.LUXURY);

    // creating delivery request
    DeliveryReq req1 = new DeliveryReq(pOne, cOne);
    DeliveryReq req2 = new DeliveryReq(pTwo, cTwo);
    DeliveryReq req3 = new DeliveryReq(pThree, cThree);

    // defining shop
    Shop shop = new Shop();

    // registering observers
    shop.registerObserver(dOne);
    shop.registerObserver(dTwo);
    shop.registerObserver(dThree);
    shop.registerObserver(dFour);
    shop.registerObserver(dFive);

    // setting delivery request
    shop.setDeliveryRequest(req1);

    // checking notification for different drivers
    assertEquals(req1.getRequestDetail(), dOne.getLastRequest());
    assertEquals(req1.getRequestDetail(), dTwo.getLastRequest());
    assertEquals(req1.getRequestDetail(), dThree.getLastRequest());
    assertEquals(req1.getRequestDetail(), dFour.getLastRequest());


  }

}
