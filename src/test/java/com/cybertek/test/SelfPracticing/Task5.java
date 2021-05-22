package com.cybertek.test.SelfPracticing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) {
        //Test Case NO=4

        //1. SetUp WebDriver and get "https://www.cargurus.com/"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Maximize the window
        driver.manage().window().maximize();

        //3. Give 3 seconds break to the DRIVER - do NOT use Thread.sleep
        //
        //4. Click on Make/Model and Select BMW
        //
        //5. Click on Body Style and Select M6
        //
        //6. Click on Zip area and send your local ZIPCODE + Click Search
        //
        //7. On the following page click on the FROM Year (which is the first on the left) and choose 2013
        //
        //8. Click on the TO year - which is the one on the right and choose 2019
        //
        //9. Click Search
        //
        //10. Hold WebDriver for 3 seconds to help the search results page to fully load (do NOT use Thread.sleep)
        //
        //11. On the Search result page inspect the whole html of the page, collect all the links and set up a condition to seperate the car related links from the
        //
        //other links. PRINT: The numbers of ALL links and the links with only Car in TWO seperate Print Statements. ONCE AGAIN - We are Printing ONLY AND ONLY the
        //
        //NUMBERS of - meaning how many links in Total and how many of that total are car related 😉
    }
}
