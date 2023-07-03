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

    @FindBy(css = "[name='quantity']")
    public WebElement quantity;
    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(css = "[name='name']")
    public WebElement customerName;

    @FindBy(css = "[name='street']")
    public WebElement street;
    @FindBy(css = "[name='city']")
    public WebElement city;

    @FindBy(css = "[name='state']")
    public WebElement state;

    @FindBy(css = "[name='zip']")
    public WebElement zip;

    @FindBy(css = "[name='cardNo']")
    public WebElement cardNo;

    @FindBy(css = "[name='cardExp']")
    public WebElement cardExp;

    @FindBy(css = "[type='submit']")
    public WebElement placeOrder;

}
