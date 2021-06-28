package com.cybertek.test.SoftSkills_Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment3 {

    WebDriver driver;

    @BeforeMethod
    public void accessVehicleUnderFleet() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

    }

        @Test
        public void ResetSettings() throws InterruptedException {

            WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            username.sendKeys("user174");
            Thread.sleep(1500);
            WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
            password.sendKeys("UserUser123" + Keys.ENTER);
            Thread.sleep(1500);

            WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            fleet.click();

            WebElement vehicle = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
            vehicle.click();

            WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
            resetButton.click();

            WebElement ViewPerPage = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
            ViewPerPage.click();

            WebElement ViewPerPage10 = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]"));
            ViewPerPage10.click();

            WebElement ResetGrid = driver.findElement(By.xpath("//a[@title='Reset']"));
            ResetGrid.click();

            String expected = "25";
            String actual = driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).getText();

            Assert.assertEquals(actual, expected, "View Per Page is not matching with expected");

        }


}


//UserStory
//1.As a truck driver I should be able to access Vehicle under Fleet module.

//As a truck driver I should be able to Reset the settings

//Truck driver is able to access vehicle page under fleet
//Truck driver is able to see reset icon and click on it.
//Truck driver can change the view by clicking on view per page
// Truck driver can reset the grid by clicking on reset button