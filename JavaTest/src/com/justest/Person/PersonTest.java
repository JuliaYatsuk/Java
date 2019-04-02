package com.justest.Person;

import com.justest.logging.LoggingLevel;
import org.testng.annotations.Test;
//import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;





public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    private static final int PENDING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    public String[] states(){
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1;
        for(int i=0;i<4;i++) {
           person1 = new Person();
      }
        assertEquals(4,Person.numberOfPersons());
    }

    @Test
    public void shouldReturnHelloWorld(){

        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld() );
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person newPerson = new Person();
        assertEquals("Hello Marcus",newPerson.hello("Marcus") );
    }



    @Test
    public void shouldReturn() {
        LoggingLevel state_ = LoggingLevel.PROCESSING;

        switch (state_){
            case PENDING:
                System.out.println(1);
                break;
            case PROCESSING:
                System.out.println(2);
                break;
            case PROCESSED:
                System.out.println(3);
                break;
            default: System.out.println(state_);
        }

        for (LoggingLevel state : LoggingLevel.values()) {
              if(state == LoggingLevel.PENDING ) {
                  //assertEquals("Hello Marcus", newPerson.hello("Marcus"));
                  System.out.println(state);
              }
            if(state == LoggingLevel.PROCESSING ) {
               // assertEquals("Hello Marcus", newPerson.hello("Marcus"));
                System.out.println(state);
            }
            if(state == LoggingLevel.PROCESSED ) {
              //  assertEquals("Hello Marcus", newPerson.hello("Marcus"));
                System.out.println(state);
            }
        }
    }

}
