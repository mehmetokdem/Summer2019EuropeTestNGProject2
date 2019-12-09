package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
    public void test1(){
        System.out.println("First asssertion");
        Assert.assertEquals("1","1");

        System.out.println("Second Assertion");
        Assert.assertEquals("title","titlE");

        System.out.println("after second assertion");


    }

    @Test
    public void test2(){
        //verify that title starts with C
        String actualTitle="Cybertek";
        String expectTitleBeginning ="B";

        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectTitleBeginning),"Verify title starts with C");



    }





}
