package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features="src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, //to check that all the snipes are implemented or not. if dryRun is true--> Without open browser
        tags = "   @wipWiki"



)

public class CukesRunner {

}
