package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EtsySearchPage_StepDefinitions {
    EtsySearchPage searchPage=new EtsySearchPage();
    @Given("user is on the Etsy webpage")
    public void user_is_on_the_etsy_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
        searchPage.cookie.click();
    }
    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {
        String expectedTitle="Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.";
     String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {

        searchPage.searchBox.sendKeys("Wooden Spoon");

    }

    @And("user clicks search button")
    public void userClicksSearchButton() {
        searchPage.searchButton.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        searchPage.wait.until(ExpectedConditions.titleContains("Wooden"));
        String actual_Title=Driver.getDriver().getTitle();
        Assert.assertTrue(actual_Title.contains("Wooden spoon"));

        }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String search_value) {
        searchPage.searchBox.sendKeys(search_value);
    }

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String search_value_on_the_title) {
        searchPage.wait.until(ExpectedConditions.titleContains(search_value_on_the_title));
        String actual_Title=Driver.getDriver().getTitle();
        Assert.assertTrue(actual_Title.contains(search_value_on_the_title));
    }
}
