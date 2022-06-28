package runnerAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresAssignment/EditLead.feature",glue = "stepsEditLead",monochrome = true,publish = true)


public class CucumberEditLead extends AbstractTestNGCucumberTests {

}
