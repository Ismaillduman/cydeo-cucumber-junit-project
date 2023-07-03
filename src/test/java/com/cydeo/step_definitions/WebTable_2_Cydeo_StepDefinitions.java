package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableCydeoPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebTable_2_Cydeo_StepDefinitions {

    WebTableCydeoPage webTablePage = new WebTableCydeoPage();

    @Given("User on the web-table.cydeo webpage")
    public void user_on_the_web_table_cydeo_webpage() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("User enter user name as Test")
    public void userEnterUserNameAsTest() {
        webTablePage.usernameBox.sendKeys("Test");
    }

    @And("User enter password as Tester")
    public void userEnterPasswordAsTester() {
        webTablePage.passwordBox.sendKeys("Tester");
        webTablePage.loginButton.click();
    }

    @Then("user verify URL")
    public void user_verify_url() {
        webTablePage.wait.until(ExpectedConditions.urlContains("orders"));
        String actual_url = Driver.getDriver().getCurrentUrl();
        System.out.println(actual_url);
        Assert.assertTrue(actual_url.contains("orders"));
    }

    @When("User enter user name as {string}")
    public void userEnterUserNameAs(String username) {
        webTablePage.usernameBox.sendKeys(username);

    }

    @And("User enter password as {string}")
    public void userEnterPasswordAs(String password) {
        webTablePage.passwordBox.sendKeys(password);
        webTablePage.loginButton.click();
    }
}
