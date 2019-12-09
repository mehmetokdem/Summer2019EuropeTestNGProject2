package com.cybertek.tests.asyaHw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class positiveTestCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa1.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("user8");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");


        driver.findElement(By.xpath("//button[1]")).click();


        String expectedUrl = "https://qa1.vytrack.com";
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

           // Thread.sleep(5000);

         //   driver.quit();

        }


    }

}
