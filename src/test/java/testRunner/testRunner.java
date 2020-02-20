package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.*;


//@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature",
        glue = {"stepDefinitions"},
        dryRun = false, // Cross check every feature file step is contains a correspondence step data or not
        monochrome = true ,
        plugin = {"pretty" , "html:test-output"},
        tags = {"@IOSAppium"}
)
@Test
public class testRunner extends AbstractTestNGCucumberTests
{

}
