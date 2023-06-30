package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikiSearch_StepDefinitions {
    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    WikiResultPage wikiResultPage = new WikiResultPage();

    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite");

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String word) {
        wikipediaSearchPage.searchBox.sendKeys(word);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String word) {
        BrowserUtils.verifyTitleContains(word);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String word) {
        wait.until(ExpectedConditions.visibilityOf(wikiResultPage.mainHeader));
       String actualText= wikiResultPage.mainHeader.getText();
       Assert.assertEquals(word,actualText);
    }
}
