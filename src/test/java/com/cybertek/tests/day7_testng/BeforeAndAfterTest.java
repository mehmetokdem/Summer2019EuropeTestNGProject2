package com.cybertek.tests.day7_testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {

    @BeforeMethod
    public void setUpMethod(){

        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
    }


    @Test
    public void test1(){
        System.out.println("This is my test One");
    }


    @Test
    public void test2(){
        System.out.println("This is my test two");

    }

    @Test
    public void test3(){
        System.out.println("This is my test three");

    }



    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSE BROWSER");
    }



}

