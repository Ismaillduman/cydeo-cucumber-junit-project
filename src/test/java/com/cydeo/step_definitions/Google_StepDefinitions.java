package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Google_StepDefinitions {
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.de/?hl=de");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actual_title = Driver.getDriver().getTitle();
        String expected_title = "Google";
        Assert.assertEquals(actual_title, expected_title);
    }
}
