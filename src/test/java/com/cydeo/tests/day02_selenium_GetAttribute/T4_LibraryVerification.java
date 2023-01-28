package com.cydeo.tests.day02_selenium_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {



  //  TC #4: Library verifications
//1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


//2. Go to http://library2.cybertekschool.com/login.html
        driver.get(" http://library2.cybertekschool.com/login.html");



//3. Enter username: “incorrect@email.com”


        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");



//4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("anything");

//5. Verify: visually “Sorry, Wrong Email or Password” displayed

        WebElement signInButton = driver.findElement(By.tagName("button"));

        signInButton.click();


        //6. Verify: visually “Sorry, Wrong Email or Password” displayed
        //VERIFIED.

    }
}
