package com.cybertek.test.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the 'driver' object created to use selenium methods
        //maximize browser
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        // 3. Verify title:
        //Expected: "Facebook - Log in or Sign up"
        String expectedTitle = "Facebook - Log in or Sign up";
        String actualTitle = driver.getTitle();

     //   if ()
    }
}
