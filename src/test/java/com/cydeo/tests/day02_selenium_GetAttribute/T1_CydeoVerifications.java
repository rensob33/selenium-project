package com.cydeo.tests.day02_selenium_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        //Step one
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //step 2 go to

        driver.get(" https://practice.cydeo.com");


        String expectedInURl = "cydeo";

        String actualURl = driver.getCurrentUrl();

        //step 3
        if (actualURl.contains(expectedInURl)){
            System.out.println("URL verification passed");
        }else {
            System.out.println("URL verification failed");
        }


        //step 4

        String expectedTitle="Practice";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification is fail");
        }




        //close the browser
        driver.close();




    }
}
/*

1.Open chrome browser

2.go to httos://practice.cydeo.com

3. verify url contains
expected:cydeo

4. verify title:
expected :practice
 */