package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:/Users/user/eclipse-workspace/EduBridgeXLATProject3/Feature/Opencartfeatures.feature" }, glue = {
				"stepDefinitions" }, dryRun = false, monochrome = true, plugin = { "pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "")

public class RunnerLogin {

}
