package io.general.tests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/java/io/general/tests/features"),

       // format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue=   "steps",
        tags =  {"@One"}
)

public class TestRunner {
}
