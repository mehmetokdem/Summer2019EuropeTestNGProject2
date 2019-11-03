package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String title=driver.getTitle() ;

        System.out.println("title = " + title);

        //getCurrentUrl()-->gets the current url the page
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //getPageSource() --> ets the source code of the pace
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);






    }
}
