package com.cydeo.tests.day02_selenium_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkedText_Practice {
    public static void main(String[] args) {

        //Step one open chrome

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //step 2 go to :https://practice.cydeo.com

        driver.get(" https://practice.cydeo.com");


        //step 3 click A/B testng from the top of the list.

        driver.findElement(By.linkText("A/B Testing")).click();


        //step 4 verify title is : // expected: no A/B test


        String expectedTitle="No A/B Test";

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification fail");
        }


        //step 5 go back to home page by  using the .back():

        driver.navigate().back();





        //step 6 verify title equals :
        //expected: Practice


        expectedTitle = "Practice";

        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification fail");
        }





    }
}
