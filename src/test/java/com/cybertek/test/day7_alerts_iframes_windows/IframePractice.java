package com.cybertek.test.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {

    WebDriver driver;

    @BeforeClass

    public void setupClass() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void iframe_test(){

        //  driver.switchTo().frame(0);
        //2locate as a web element to switch
        //we find and locate <iframe> web element from the page
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame("mce_0_ifr");

        //#2 locate as a Web Element to switch
        //We find and locate <iframe> web element from the page.
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rich //iframe[@title'']Text Area. Press ALT-0 for help']"));


        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //        4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement headerText=driver.findElement(By.xpath("//h3"));


//        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());



    }
}
