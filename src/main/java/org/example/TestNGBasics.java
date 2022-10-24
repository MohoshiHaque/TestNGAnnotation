package org.example;

import org.testng.annotations.*;

public class TestNGBasics {

    @BeforeSuite
    public void setup1(){
        System.out.println("Mohoshi Process-1");
    }

    @BeforeClass
    public void setup2(){
        System.out.println("Mohoshi Process-2");
    }

    @BeforeMethod
    public void setup3(){
        System.out.println("Mohoshi Process-3");
    }

    @Test
    public void setup4(){
        System.out.println("Mohoshi Process-4");
    }

    @AfterMethod
    public void setup5(){
        System.out.println("Mohoshi Process-5");
    }

    @AfterClass
    public void setup6(){
        System.out.println("Mohoshi Process-6");
    }

    @AfterSuite
    public void setup7(){
        System.out.println("Mohoshi Process-7");
    }
    @Test
    public void setup8(){
        System.out.println("Mohoshi Process-8");
    }
    @AfterMethod
    public void setup9(){
        System.out.println("Mohoshi Process-9");
    }

}
