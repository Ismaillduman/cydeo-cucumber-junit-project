package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class R_VytractLoginInvalidCredentials_StepDefinitions {
    R_VytrackLoginPage loginPage= new R_VytrackLoginPage();
    @When("the user login with {string},{string}")
    public void the_user_login_with(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("the user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {
        loginPage.wait.until(ExpectedConditions.visibilityOf(loginPage.alertNotLoginMessage));
        Assert.assertTrue(loginPage.alertNotLoginMessage.isDisplayed());
    }
}
