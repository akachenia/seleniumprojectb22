package com.cybertek.test.SelfPracticing;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        //Test Case NO=2
        //1. Use WebDriverFactory method to call the Google Chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Command Chrome Browser to open YouTube.com
        driver.get("https://www.youtube.com/");

        //3. Maximize the screen
        driver.manage().window().maximize();

        //4. Locate YouTube search bar By xPath
        WebElement YouTubeSearchBar = driver.findElement(By.xpath("//input[@id='search']"));

        //5. Create a WebElement from the located Search Bar xPath
        YouTubeSearchBar.sendKeys("Blue - One Love");
        //6. Reuse the created WebElement to send search content into the serach bar and send "Blue - One Love" to the search bar
        //Put the whole thread to Sleep for 3 seconds
        Thread.sleep(3000);
        YouTubeSearchBar.submit();

        WebElement clip = driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Blue - One Love (Official Music Video) by Relie Helei 4 years ago 3 minutes, 32 seconds 1,095,458 views']"));
        //7. Resuse the created WebElement and SUBMIT the search
        //Put the whole thread to Sleep for 3 seconds
        Thread.sleep(3000);
        //8. Click on the first Music video named: Blue - One Love (Official Music Video) (FEEL FREE TO USE WHATEVER LOCATER YOU WANT - JUST CLICK ON THAT VIDEO)
        clip.click();
    }

}


