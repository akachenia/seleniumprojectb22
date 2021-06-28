package com.cybertek.test.SoftSkills_Assignment;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.VytrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment5 {
    /**  Given: I am on Vytrack login page
     When : I log in with valid username and password
     And: I am redirected to home page
     When: I hover over Fleet and see Vehicles button
     And: I click Vehicles button
     And: I am redirected to Car Grid page
     When: I see an Export Grid button and click it
     Then: I should be able to click it and see dropdowns "CSV" AND "XLSX"
     */
    @Test

    public void Login_Page(){
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));

        HomePage homePage = new HomePage();
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

        vytrackLoginPage.username.sendKeys(ConfigurationReader.getProperty("username1"));
        vytrackLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        vytrackLoginPage.loginButton.click();

        homePage.fleet.click();
        homePage.vehicles.click();
        homePage.ExportGridBtn.click();

        Assert.assertTrue(homePage.ExportGridBtn.isDisplayed());
    }

}
