package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pkshank\\eclipse-workspace\\BDD_Framework_Data_Driven\\src\\test\\java\\features\\hooks_and_tagged_hooks.feature", glue = {
		"StepDefinitions" }, plugin = { "pretty", "html: test-output", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = true, strict = true, dryRun = false,
				tags= {"@SearchFeature"}
				)

public class Test_Runner {

}
