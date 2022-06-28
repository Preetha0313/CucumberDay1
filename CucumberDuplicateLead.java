package runnerAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresAssignment/DuplicateLead.feature",glue = "stepsDuplicateLead",monochrome = true,publish = true)


public class CucumberDuplicateLead extends AbstractTestNGCucumberTests{

}
