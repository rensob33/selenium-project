package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_getText {
    public static void main(String[] args) {



        //step one

       // WebDriverManager.chromedriver().setup();

       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();

        //step two

        driver.get("https://login1.nextbasecrm.com/");

        //step three


        WebElement loginBox = driver.findElement(By.name("USER_LOGIN"));
        loginBox.sendKeys("INCORRECT");


        //step 4


        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));

        passwordBox.sendKeys("INCORRECT");

        //step 5 click the login button

        WebElement loginButton = driver.findElement(By.className("login-btn"));

        loginButton.click();

        //6verify error message text is aas expected
        //expected: Incorrect login or password

        String expectedErrorText = "Incorrect login or password";

        String actualErrorText= driver.findElement(By.className("errortext")).getText();

        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("Error text verification passed");
        }else {
            System.out.println("Error text verification failed");
        }







    }

}
