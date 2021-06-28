package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[1]")
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement ExportGridBtn;

}
