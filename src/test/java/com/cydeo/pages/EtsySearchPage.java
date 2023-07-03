package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EtsySearchPage {
    public WebDriverWait wait;

    public EtsySearchPage() {

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']")
    public WebElement cookie;

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;
}
