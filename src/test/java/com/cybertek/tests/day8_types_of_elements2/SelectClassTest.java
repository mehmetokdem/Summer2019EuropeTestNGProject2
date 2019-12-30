package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown ");

        //1.locate the dropdown element wıth unique locator
        WebElement dropdownElement =driver.findElement(By.id("state"));

        //create Select object by passıng the element as a constructor
        Select stateList = new Select(dropdownElement);

        //getOptions--> returns all the availanle options from the dropdown list
        List<WebElement> options = (List<WebElement>) stateList.getOptions();

        for (WebElement option : options) {
            option.getText();
            System.out.println(option.getText());
        }

    }

    @Test
        public void test2() throws InterruptedException {
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dropdown ");

            //1.locate the dropdown element wıth unique locator
            WebElement dropdownElement =driver.findElement(By.id("state"));

            //create Select object by passıng the element as a constructor
            Select stateList = new Select(dropdownElement);

            //verify that firs option is "select a state"
            String expectedOption= "Select a state";
            String actualOption = stateList.getFirstSelectedOption().getText();

            Assert.assertEquals(actualOption,expectedOption,"verify first selection is select a state");
           // System.out.println(actualOption);

             Thread.sleep(2000);
             //select texas from dropdown
             stateList.selectByVisibleText("Texas");

             actualOption = stateList.getFirstSelectedOption().getText();
             Assert.assertEquals(actualOption,"texas");



             //2.Using index number
        //total option-->52

        stateList.selectByIndex(51);
            System.out.println(stateList.getFirstSelectedOption().getText());

            //Using Value
        Thread.sleep(2000);
        stateList.selectByValue("VA");
            System.out.println(stateList.getFirstSelectedOption().getText());







        }
    }
