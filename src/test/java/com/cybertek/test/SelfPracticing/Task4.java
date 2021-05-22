package com.cybertek.test.SelfPracticing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        //Test Case NO=3
        //1. SetUp The chrome Driver Calling WebDriver Manager / Bonigarcia Dependencies (Not the Method)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Access the Yahoo Email Login page with this
        // link: "https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd"
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

        //3. Make the browser screen => fullscreen
        driver.manage().window().maximize();

        //4. Check the title of the Yahoo page with an IF statement
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification passed!");
        } else {
            System.out.println("Verification Failed");
        }
        //5. Locate the username space By ID
        WebElement inputUsername = driver.findElement(By.id("login-username"));


        //6. Send the username credentials to the located username space.
        // Use "batch22@yahoo.com" - as username
        inputUsername.sendKeys("batch22@yahoo.com");

        //Put the whole thread to Sleep for 3 seconds
        Thread.sleep(3000);
        inputUsername.submit();

        //7. Click NEXT to go to the next (Password insert space)
        WebElement NextButton = driver.findElement(By.id("class=pure-button puree-button-primary challenge-button"));
        NextButton.click();
        Thread.sleep(1000);
        //8. Locate the password space By ID
        //WebElement password = driver.findElement(By.id(""))
        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
        password.sendKeys("Feb21@2021");
        Thread.sleep(1000);

        WebElement NextButton2 = driver.findElement(By.xpath("//button[@id='login-signin']"));
       //  NextButton2.click();


        String expectedTitle2 = "(8 unread) - batch22@yahoo.com - Yahoo Mail";
        String actualTitle2 = driver.getTitle();

        System.out.println(actualTitle2.equals(expectedTitle2) ? "Pass" : "Fail");

        Thread.sleep(3000);

        driver.quit();
    }
}





