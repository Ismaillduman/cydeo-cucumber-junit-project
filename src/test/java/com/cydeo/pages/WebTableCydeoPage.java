package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTableCydeoPage {
    public WebDriverWait wait;
    public WebTableCydeoPage(){
        wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[name=username]")
    public WebElement usernameBox;

    @FindBy(css = "[name=password]")
    public WebElement passwordBox;

    @FindBy(css = ".btn.btn-primary.login__submit")
    public WebElement loginButton;


}
