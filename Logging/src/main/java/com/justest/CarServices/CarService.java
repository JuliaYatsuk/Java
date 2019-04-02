package com.justest.CarServices;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class CarService {

       // private final Logger log = LoggerFactory.getLogger(CarService.class);

        public void drive()  {
               Car[] cars = {new BMW(), new Mercedes(), new Porche(),};
               for(Car car : cars) {
                       car.drive();
               }
        }
}
