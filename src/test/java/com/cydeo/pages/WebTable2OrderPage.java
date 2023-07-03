package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTable2OrderPage {
    public WebDriverWait wait;

    public WebTable2OrderPage() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='button nav__item'])[2]")
    public WebElement orderButton;


    @FindBy(css = "[name='product']")
    public WebElement productOptions;

@FindBy(xpath = "//div/label[@class='radio']")
    public List<WebElement> paymentRadioButtons;

}
