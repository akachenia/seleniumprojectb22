package com.cybertek.test.SoftSkills_Assignment;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment3_finalVersion {


    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

        WebElement usernameLogin = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameLogin.sendKeys("user174");

        WebElement passwordLogin = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passwordLogin.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();
    }

    @BeforeMethod
    public void vehiclesPage() throws InterruptedException {

        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        Thread.sleep(2000);
        WebElement vehiclesButton= driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehiclesButton.click();

    }

    @Test (priority = 1)
    public void seeVehicles() throws InterruptedException {

        Thread.sleep(2000);
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title not verified");
    }

    @Test (priority = 2)
    public void generalInformation() throws InterruptedException {

        WebElement chooseVehicle = driver.findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[8]"));
        chooseVehicle.click();
        Thread.sleep(2000);


    }
    @Test (priority = 3)
    public void addEvent() throws InterruptedException {

        WebElement chooseVehicle = driver.findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[8]"));
        chooseVehicle.click();
        Thread.sleep(2000);

        WebElement addEventButton = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
        addEventButton.click();
        Thread.sleep(2000);

        WebElement addTitleInEvent = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        addTitleInEvent.sendKeys("Oil Change Due");
        Thread.sleep(2000);

        driver.switchTo().frame(0);

        WebElement eventDescription = driver.findElement(By.xpath("//body[@id='tinymce']"));

        eventDescription.sendKeys("Send vehicle in for an oil change on the 7th of June (6/7/2021)");
        Thread.sleep(3000);

        driver.switchTo().parentFrame();

        WebElement submitInEvent = driver.findElement(By.xpath("//button[@type='submit']"));
        submitInEvent.click();
        Thread.sleep(2000);

        String actualSaveMessage = driver.findElement(By.xpath("//div[@class='message']")).getText();
        String expectedSaveMessage = "Calendar event saved";

        Assert.assertEquals(actualSaveMessage,expectedSaveMessage,"Save MessageBug");


        WebElement activityTab = driver.findElement(By.xpath("//li[@class='active']"));
        activityTab.click();
        Thread.sleep(2000);


        WebElement activityTabFirstOption = driver.findElement(By.xpath("(//div[@class='message-item message'])[1]"));
        activityTabFirstOption.click();
        Thread.sleep(2000);

        WebElement activityTitle = driver.findElement(By.xpath("(//div[@class='control-label'])[23]"));
        String actualActivityTitle = activityTitle.getText();
        String expectedActivityTitle = "Oil Change Due";

        Assert.assertEquals(actualActivityTitle,expectedActivityTitle, "ActivityTitle Bug");

    }

    @Test (priority = 4)
    public void resetSettings() throws InterruptedException {

        WebElement viewPerPage = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle ']"));
        viewPerPage.click();
        Thread.sleep(2000);

        WebElement click100 = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]"));
        click100.click();
        Thread.sleep(2000);

        WebElement resetGrid = driver.findElement(By.xpath("//a[@title='Reset']"));
        resetGrid.click();

        String expectedViewPerPage = "25";
        String actualViewPerPage = driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).getText();
        System.out.println("Just printing to see the result in the console, Actual result = "+actualViewPerPage );
        Assert.assertEquals(actualViewPerPage, expectedViewPerPage, "View Per Page is not matching with expected");

    }

    @AfterClass
    public void closeDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}




