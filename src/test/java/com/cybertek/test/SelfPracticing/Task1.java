package com.cybertek.test.SelfPracticing;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

       String check = actualTitle.equals(expectedTitle) ? "Passed: Actual title matches expected" : "Fall";
        System.out.println(check);

       WebElement usernameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
       usernameLoginPage.sendKeys("Storemanager201");

       WebElement passwordLoginPage = driver.findElement(By.xpath("//input[@type='password']"));
       passwordLoginPage.sendKeys("UserUser123");
       passwordLoginPage.submit();

       String ActualTitle02 = driver.getTitle();
        System.out.println(driver.getTitle());
        String expectedTitle02 = "Dashboard";

        String check2 = ActualTitle02.equals(expectedTitle02) ? "Passed" : "Failed";
        System.out.println(check2);

        String checkLoginVsDashboard = ActualTitle02.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLoginVsDashboard
        );
    }
}
