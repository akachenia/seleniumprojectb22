package com.cybertek.test.SelfPracticing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        //WARM UP:
        //
        //Amazon.com Search "Wooden Spoon"
        //
        //1. Build the WebDriverManager and call Chrome Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2. Go to Amazon.com
        driver.get("https://www.amazon.com/");

        //3. Locate the amazon search bar

       driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("wooden spoon" + Keys.ENTER);

        //4. Send "Wooden Spoon" and click search
        String actualtitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";

        if (actualtitle.contains(expectedInTitle)){
            System.out.println("Title as expected. Test passed");
        }else{
            System.out.println("Test failed");
        }
        //5. Check the title with if conditon
    }
}
