package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features/Login.feature","src/test/java/features/placeValidations.feature" },tags = "@deletePlaceApi", plugin="json:target/jsonReports/cucumber-report.json",glue = { "stepDefinition" })
public class TestRunner {
	//tags = "@deletePlaceApi",tags = "@deletePlaceApi or @AddPlaceApi",

}
