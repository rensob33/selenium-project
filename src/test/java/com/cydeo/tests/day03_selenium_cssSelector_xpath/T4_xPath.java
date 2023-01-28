package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xPath {
    public static void main(String[] args) {




        // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        // 2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        String expectedLoginText = "Log In";

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        String actualLoginText = loginButton.getAttribute("value"); //-->Login

        if (actualLoginText.equals(expectedLoginText)){
            System.out.println("Login button verification passed");
        }else{
            System.out.println("failed");
        }

    }
}
