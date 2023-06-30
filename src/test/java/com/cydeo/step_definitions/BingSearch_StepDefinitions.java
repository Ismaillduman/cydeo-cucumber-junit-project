package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BingSearch_StepDefinitions {

    BingSearchPage bingSearch= new BingSearchPage();
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @When("user is on the Bing search page")
    public void userIsOnTheBingSearchPage() {
        Driver.getDriver().get("https://www.bing.com/?cc=de");

    }

    @Then("user should see title is Bing")
    public void userShouldSeeTitleIsBing() throws InterruptedException {
        BrowserUtils.verifyTitle("Bing");
       // Thread.sleep(3000);
    }

    @When("user bing search the {string}")
    public void userBingSearchThe(String search_item) {

        wait.until(ExpectedConditions.elementToBeClickable(bingSearch.inputBox));
        bingSearch.inputBox.sendKeys(search_item);
        bingSearch.inputBox.sendKeys(Keys.ENTER);

    }

    @Then("title is on the bing {string}")
    public void titleIsOnTheBing(String expected_title) {
        BrowserUtils.verifyTitle(expected_title);
    }
}
