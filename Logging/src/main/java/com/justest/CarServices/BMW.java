package com.justest.CarServices;

public class BMW implements Car, Asset, Loggable, Property {
    public void drive() {
        System.out.println("BMW driving...");
    }

    public int value(){
        return 8000;
    }

    public String owner(){
        return "Marcus";
    }

    public String message(){
        return "I am a car of Marcus";
    }
}
