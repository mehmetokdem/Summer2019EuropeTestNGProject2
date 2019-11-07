package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //navigate to website
        driver.get("http://practice.cybertekschool.com//sign_up");

        //enter full name
        WebElement fullnameInput = driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("silentwolf@gmail.com");

        //clicking sign up button
        WebElement SignUpButton = driver.findElement(By.name("wooden_spoon"));
        SignUpButton.click();

        //verify that you got "Thank you for signing up. Click the button below to return to the home page."

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        WebElement comfirmationmessage = driver.findElement(By.name("signup_message"));

        String actualMessage = comfirmationmessage.getText();
        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);

            //close the window
            driver.quit();


        }
    }
}
