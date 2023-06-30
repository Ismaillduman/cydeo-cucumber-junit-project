package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//*[.='Alle ablehnen'])[2]")
    public WebElement rejectCookies;

    @FindBy(id = "APjFqb")
    public WebElement searchBox;
}
