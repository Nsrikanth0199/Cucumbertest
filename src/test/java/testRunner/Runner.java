package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"featuresFiles"},monochrome= true,glue = {"stepDefinition"},plugin = {"pretty", "html:target/cucumber-reports"})


public class Runner {

}
