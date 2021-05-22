package com.cybertek.test.SelfPracticing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    public static void main(String[] args) {
        //TC #1: YahooTitle Verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // 3.Verify title: Expected: Yahoo
        String expectedTitle = "Yahoo";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }
            driver.close();

    }



}
