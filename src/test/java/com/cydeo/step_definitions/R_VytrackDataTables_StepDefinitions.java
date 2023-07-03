package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackDashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

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
}
