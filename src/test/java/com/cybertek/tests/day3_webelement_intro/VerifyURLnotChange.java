package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotChange {
    /**Verify URL not changed
    * open browser
    * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    * click on Retrieve password
     *verify that url did not change
     */

    public static void main(String[] args) {

        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to  http://practice.cybertekschool.com/forgot_password Links to an external
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save URL to string variable
        String expectedUrl =driver.getCurrentUrl();

        //click on Retrieve password
        //Webelement --> class that represenets element on the webpage
        //findElement--> method used to find element on a page
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
       //click()-->clicking web element
        retrievePasswordButton.click();

        //verify that url did not change
        String actualUrl =driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }

        //close the browser
        driver.quit();





    }
}
