package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class VerifyConfirmationMessage {

    /**
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) throws InterruptedException {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate to website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputbox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";
        //send some email
        emailInputbox.sendKeys(expectedEmail);

        System.out.println(emailInputbox);
        //veify that email is displayed in the input box
        //gettin text from webelements
        //getText()--> get the from web element %99
        //getAttribute()--> get value of attributes
        String actualEmail = emailInputbox.getAttribute("value");

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }

        //locating retrievePasswordButton using id attribute
        WebElement reteievePasswordButton = driver.findElement(By.id("form_submit"));
        //clicking webelement
        reteievePasswordButton.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage = "Your e-mail's been sent!";

        WebElement messageElement = driver.findElement(By.name("confirmaiton_message"));

        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        // close the browser
        driver.quit();

    }


}


