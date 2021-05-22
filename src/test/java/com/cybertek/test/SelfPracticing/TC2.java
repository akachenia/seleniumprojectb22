package com.cybertek.test.SelfPracticing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    public static void main(String[] args) {
        //TC #2: Cybertekpractice toolverifications

        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");

        // 3.Verify URL contains
        // Expected: cybertekschool
       String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

       if (actualURL.contains(expectedURL)) {
           System.out.println("Verification Passed!");
       } else {
           System.out.println("Verification Failed");
       }

        //4. Verify title: Expected: Practice
       String expectedTitle = "Practice";
      String actualTitle = driver.getTitle();
       if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification passed!");
       } else {
            System.out.println("Verification failed!");
        }
   }
}
