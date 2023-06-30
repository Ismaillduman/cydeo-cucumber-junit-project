package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

/*Task 1: Google Search Title Verification
1. Go to https://www.google.com
2. Search for “apple”
3. Verify title is:
a. Expected = “apple – Google Search”
Note:
1. Follow POM Design Pattern
2. BDD implementation*/


public class Google_StepDefinitions {
    GooglePage googlePage = new GooglePage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() throws InterruptedException {


        Driver.getDriver().get("https://www.google.de/?hl=de");
        googlePage.rejectCookies.click();
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actual_title = Driver.getDriver().getTitle();
        String expected_title = "Google";
        Assert.assertEquals(actual_title, expected_title);
    }

    @When("user search the {string}")
    public void userSearchThe(String search) {
        googlePage.searchBox.sendKeys(search);
        googlePage.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("title is {string}")
    public void titleIs(String expected) {
//        String actualTitle = Driver.getDriver().getTitle();
//        Assert.assertEquals( expected, actualTitle);
        BrowserUtils.verifyTitle(expected);

    }
}
