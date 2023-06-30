package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Hooks {

    @Before
    public void setUp() {
        System.out.println("before all method");

    }

    @After
    public void tearDown() {
        System.out.println("after all method");
        Driver.closeDriver();
    }

}
