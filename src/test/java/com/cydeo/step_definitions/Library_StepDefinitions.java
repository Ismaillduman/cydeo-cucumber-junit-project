package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("user is on the login page of the library application");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian usernamev");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
    }
}
