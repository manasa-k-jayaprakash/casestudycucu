package TESTMEAPP;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Handson\\Casestudy\\src\\test\\resources\\case3.feature",
plugin= {"html:target/Reports"})
public class TestRun {
 
}

