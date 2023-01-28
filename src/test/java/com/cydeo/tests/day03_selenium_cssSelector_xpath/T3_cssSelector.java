package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {
    public static void main(String[] args) {


       // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


       // 2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        String expectedLoginText = "Log In";

        //locating login button  using class attributes value

       // WebElement loginButton = driver.findElement(By.className("login-btn"))

          WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
         String actualLoginText = loginButton.getAttribute("value"); //-->Login

            if (actualLoginText.equals(expectedLoginText)){
                System.out.println("Login button verification passed");
            }else{
                System.out.println("failed");
            }




        //PS: Inspect and decide which locator you should be using to locate webelements.
               // PS2: Pay attention to where to get the text of this button from
    }
}
