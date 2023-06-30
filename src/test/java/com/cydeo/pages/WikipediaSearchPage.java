package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
    public WikipediaSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(css = ".vector-search-box-input")
    public WebElement searchBox;

    @FindBy(id = "searchButton")
    public WebElement searchButton;


}
