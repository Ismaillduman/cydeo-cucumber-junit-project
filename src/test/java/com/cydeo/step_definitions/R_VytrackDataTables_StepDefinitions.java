package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackDashboardPage;
import com.cydeo.pages.R_VytrackLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class R_VytrackDataTables_StepDefinitions {
    R_VytrackDashboardPage dashboardPage= new R_VytrackDashboardPage();
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
        dashboardPage.wait.until(ExpectedConditions.titleContains("Dashboard"));
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachTopALlModule : dashboardPage.topALlModules) {
            actualModules.add(eachTopALlModule.getText());
        }
        System.out.println("expectedModules = " + expectedModules);
        System.out.println("actualModules = " + actualModules);
        Assert.assertEquals(expectedModules,actualModules);

    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        R_VytrackLoginPage loginPage= new R_VytrackLoginPage();
        String userName=credentials.get("username");
        String password= credentials.get("password");

        loginPage.login(userName,password);
    }
    @Then("user should be able to see following information")
    public void user_should_be_able_to_see_following_information(Map<String, String> information) {
String firstName=information.get("firstname");
String lastName=information.get("lastname");
dashboardPage.wait.until(ExpectedConditions.visibilityOf(dashboardPage.fullName));
Assert.assertEquals(firstName+" "+lastName,dashboardPage.fullName.getText());
    }
}
