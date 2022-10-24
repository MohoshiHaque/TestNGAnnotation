package org.example;

import org.testng.annotations.*;

public class TestNGBasics {

    @BeforeSuite
    public void setup1(){
        System.out.println("Before Suite-1");
    }

    @BeforeClass
    public void setup2(){
        System.out.println("Before Class-1");
    }

    @BeforeMethod
    public void setup3(){
        System.out.println("Before Method-1");
    }

    @BeforeMethod
    public void setup3_1(){
        System.out.println("Before Method-2");
    }

    @Test
    public void setup4(){
        System.out.println("Test-1");
    }

    @Test
    public void setup4_3(){
        System.out.println("Test-3");
    }

    @AfterMethod
    public void setup5(){
        System.out.println("After Method-1");
    }

    @AfterClass
    public void setup6(){
        System.out.println("After Class-1");
    }

    @AfterSuite
    public void setup7(){
        System.out.println("After Suite-1");
    }
    @Test
    public void setup4_2(){
        System.out.println("Test-2");
    }
    @AfterMethod
    public void setup9(){
        System.out.println("After Method-2");
    }

}
