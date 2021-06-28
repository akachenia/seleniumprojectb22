package com.cybertek.test.SelfPracticing.RahibCLass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeVytrack {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa3.vytrack.com/user/login");

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user168");

        WebElement passWord =   driver.findElement(By.xpath("//input[@type='password']"));

        passWord.sendKeys("UserUser123" + Keys.ENTER);

      //  passWord.submit();

        driver.navigate().refresh();

        List<WebElement> activitiesButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));

        activitiesButton.get(2).click();


        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[.='Calendar Events']")).click();

        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();

        driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Truck Driver");

        driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();
    }
}
