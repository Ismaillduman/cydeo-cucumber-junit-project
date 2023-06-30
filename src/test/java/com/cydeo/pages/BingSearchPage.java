package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {
    public BingSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
