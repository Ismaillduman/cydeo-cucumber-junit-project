package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataTable_StepDefinitions {

    DataTablePage tablePage= new DataTablePage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths ) {

        List<String> actualMonths= BrowserUtils.dropdown_options_as_string(tablePage.month_as_WebElement);
        Assert.assertEquals(expectedMonths,actualMonths);
    }
}
/* public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement){

        Select month = new Select(dropdownElement);
        //Storing all the ACTUAL options into a List of WebElements
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

        //Creating an EMPTY list of String to store ACTUAL <option> as String
        List<String> actualMonth_as_STRING = new ArrayList<>();

        //Looping through the List<WebElement>, getting all options' texts, and storing them into List<String>
        for (WebElement each : actualMonth_as_WEBELEMENT) {

            actualMonth_as_STRING.add(each.getText());

        }

        return actualMonth_as_STRING;

    }*/