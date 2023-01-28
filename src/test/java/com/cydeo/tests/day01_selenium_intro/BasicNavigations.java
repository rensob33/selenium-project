package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //set browser driver
        WebDriverManager.chromedriver().setup();


        //create instance of chrome browser
        WebDriver driver = new ChromeDriver();


        //this line will maximize the currently opened browser
        driver.manage().window().maximize();


        // go to tesla.com
        driver.get("https://www.tesla.com");

        //use .getcurrenturl method to print out current ur;
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        //get title of the page soutv
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("CurrentTitle = "+currentTitle);



        // use navigate back to go back
        driver.navigate().back();

        // stop execution for 3 seconds
        Thread.sleep(3000);


        //use navigate forward to go forward
        driver.navigate().forward();



        // stop execution for 3 seconds
        Thread.sleep(3000);


        //user refreshes the pages using navigate .refresh();
        driver.navigate().refresh();


        // stop execution for 3 seconds
        Thread.sleep(3000);


        // driver navigate to google.com using navigate to
        driver.navigate().to("https://www.google.com");


        //use .getcurrenturl method to print out current ur;
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());



        //get title of the page soutv

        //System.out.println("driver.getTitle() = " + driver.getTitle());

         currentTitle = driver.getTitle();
        System.out.println("CurrentTitle = "+currentTitle);


        //closes only the currently focused window/tab
        driver.close();

        //closes all the opened browsers
        driver.quit();





    }
}
