package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Hooks {

    @Before
    public void setUp() {


    }

    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

       Driver.closeDriver();
    }

}
