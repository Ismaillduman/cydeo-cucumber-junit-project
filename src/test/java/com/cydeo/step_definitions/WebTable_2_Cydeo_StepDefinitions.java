package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable2OrderPage;
import com.cydeo.pages.WebTableCydeoPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WebTable_2_Cydeo_StepDefinitions {

    WebTableCydeoPage webTablePage = new WebTableCydeoPage();
    WebTable2OrderPage orderPage = new WebTable2OrderPage();

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


    @When("user is on the order page")
    public void userIsOnThePage() {
        orderPage.wait.until(ExpectedConditions.visibilityOf(orderPage.orderButton));
        orderPage.orderButton.click();

    }

    @Then("user sees below options under product dropdown")
    public void userSeesBelowOptionsUnderDropdown(List<String> expected_product_as_string) {


        Select products = new Select(orderPage.productOptions);

        List<WebElement> actual_products = products.getOptions();

        List<String> actual_product_as_string = new ArrayList<>();
        for (WebElement each_product_element : actual_products) {
            actual_product_as_string.add(each_product_element.getText());
        }

        Assert.assertEquals(expected_product_as_string, actual_product_as_string);


    }

    @Given("user is already logged in to The Web table app")
    public void userIsAlreadyLoggedInToTheWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablePage.usernameBox.sendKeys("Test");
        webTablePage.passwordBox.sendKeys("Tester");
        webTablePage.loginButton.click();
    }

    @Then("user sees below radio buttons enabled for")
    public void userSeesBelowRadioButtonsEnabledFor(List<String> expected_PaymentCards) {
        List<String> actual_PaymentCards_as_String = new ArrayList<>();
        for (WebElement eachPaymentRadioButton : orderPage.paymentRadioButtons) {
            actual_PaymentCards_as_String.add(eachPaymentRadioButton.getText());
        }
        Assert.assertEquals(expected_PaymentCards,actual_PaymentCards_as_String);
    }
}
