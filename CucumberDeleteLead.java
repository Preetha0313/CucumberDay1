package runnerAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresAssignment/DeleteLead.feature",glue = "stepsDeleteLead",monochrome = true,publish = true)


public class CucumberDeleteLead extends AbstractTestNGCucumberTests{

}
