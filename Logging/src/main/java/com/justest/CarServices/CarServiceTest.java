package com.justest.CarServices;

import org.testng.annotations.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstarteInterfaces()  {
        CarService carservice = new CarService();
        carservice.drive();
    }
}
