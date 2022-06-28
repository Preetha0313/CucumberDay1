package runnerAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresAssignment/CreateLead.feature",glue = "stepsCreateLead",monochrome = true,publish = true)


public class CucumberCreateLead extends AbstractTestNGCucumberTests {

}
