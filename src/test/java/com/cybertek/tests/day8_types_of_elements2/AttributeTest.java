package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public  void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton = driver.findElement(By.id("blue"));

        //get the value of name attribute
        System.out.println(radioButton.getAttribute("name"));

        //get the value of id attribute
        System.out.println(radioButton.getAttribute("id"));
        //get the value of the type attribute
        System.out.println(radioButton.getAttribute("type"));

        //tryıng to get attribute does not exist
        //when we use non exist attribute it will return NULL to us.
        System.out.println(radioButton.getAttribute("href"));

        //attribute without value (checked)
        //checked atrıbute value is boolean if it is checked it will be true
        System.out.println(radioButton.getAttribute("checked"));

        //"outherHTML" returns full html of that element
        System.out.println(radioButton.getAttribute("outherHTML"));

        //3rd way of gettıng text "innerHTML" (certain cases)
       // System.out.println(radioButton.getAttribute("innerHTML"));





    }


}
