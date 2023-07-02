package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class R_VytrackLogin_StepDefinitions {
    R_VytrackLoginPage loginPage = new R_VytrackLoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("store_manager_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        loginPage.loginButton.click();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Dashboard"));
        BrowserUtils.verifyTitle("Dashboard");
    }

    @When("user enters the driver information")
    public void userEntersTheDriverInformation() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
    }
}
