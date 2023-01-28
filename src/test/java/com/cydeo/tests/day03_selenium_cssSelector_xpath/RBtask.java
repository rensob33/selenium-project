package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBtask {
    public static void main(String[] args) {

        //Step one open chrome driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //step two

        driver.get("https://www.thisisstrane.com/strane#cartridges");






    }
}
