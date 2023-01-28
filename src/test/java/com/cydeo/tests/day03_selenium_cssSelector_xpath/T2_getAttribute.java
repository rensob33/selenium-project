package com.cydeo.tests.day03_selenium_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getAttribute {
    public static void main(String[] args) {

       // TC #2: NextBaseCRM, locators, getText(), getAttribute() practice



       // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();


       // 2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “remember me” label text is as expected:
       // Expected: Remember me on this computer

        String expectedLable = "Remember me on this computer";

        String  actualLable = driver.findElement(By.className("login-item-checkbox-label")).getText();


        if (actualLable.equals(expectedLable)){
            System.out.println("Passed ");
        }else {
            System.out.println("failed");
        }


        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?


        String expectedForgotPassTest = "forgot your password?";

        WebElement forgotPassLink = driver.findElement(By.className("login-link-forgot-pass"));

        String actualForgotPassText = forgotPassLink.getText();

        if (actualForgotPassText.equalsIgnoreCase(expectedForgotPassTest)){

            System.out.println("Passed");
        }else {
            System.out.println(actualForgotPassText);
            System.out.println(expectedForgotPassTest);
            System.out.println("Failed");
        }

           //5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";

        String actualHrefValue= forgotPassLink.getAttribute("href");

        if (expectedInHref.equalsIgnoreCase(actualHrefValue)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


        //PS: Inspect and decide which locator you should be using to locate web elements.


    }
}
