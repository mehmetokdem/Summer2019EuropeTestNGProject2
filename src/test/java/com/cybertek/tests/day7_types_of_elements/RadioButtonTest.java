package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButton(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement redRadioButton=driver.findElement(By.id("red"));

        //how to check radio button selected or not ?
        System.out.println("Is blue selected: "+ blueRadioButton.isSelected());
        System.out.println("Is red selected: "+ redRadioButton.isSelected());

        //verify that blue radiı button selected



        Assert.assertTrue(blueRadioButton.isSelected(),"Verify that blue button is selected");
        Assert.assertFalse(redRadioButton.isSelected(),"Verify that red button is not selected");
        //how to select radio btton ?
        System.out.println("Clicking red radio button");
        redRadioButton.click();

        System.out.println("Is blue selected: "+ blueRadioButton.isSelected());
        System.out.println("Is red selected: "+ redRadioButton.isSelected());

        //verify blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue is not selected");
        //verify red is selected
        Assert.assertTrue(redRadioButton.isSelected(),"verify that red is selected");

        //driver.quit();
    }
}
