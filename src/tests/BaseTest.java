package tests;

import org.testng.annotations.Test;

public class BaseTest {
    //setup

    public void setup(){
        System.out.println("this is setup");
    }
    //tear down
    public void tearDown(){
        System.out.println("this is tearDown");
    }
    //testOne
    @Test
    public void testOne(){
        System.out.println("this is testOne");
    }
}
