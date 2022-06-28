package runnerAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresAssignment/CreateContact.feature",glue = "stepsCreateContact",monochrome = true,publish = true)


public class CucumberCreateContact extends AbstractTestNGCucumberTests{

}
