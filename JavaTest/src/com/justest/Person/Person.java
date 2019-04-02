package com.justest.Person;

import com.justest.Name.Name;

public class Person {
    private static Name personName;
    private static int personCounter = 0;

    public Person(Name personName){
           this.personName=personName;
    }

    public Person(){
        personCounter++;
    }

    public  String helloWorld(){

        return "Hello World";
    }

    public String hello(String name){
        return "Hello "+name;
    }

    public static int numberOfPersons(){
        return personCounter;
    }

    //public Name name(){ return personName; }
}
