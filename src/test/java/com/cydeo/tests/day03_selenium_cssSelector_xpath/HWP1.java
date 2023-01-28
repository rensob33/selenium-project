package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1 {
    public static void main(String[] args) {
        //Step one open chrome driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();



        //step 2. go to "Https://esty.com"
        driver.get("Https://esty.com");


        //3.Search for wooden spoon


        //step 4

       // WebElement estySearchBox = driver.findElement(By.xpath())





    }
}
