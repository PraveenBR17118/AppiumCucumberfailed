package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature",
        glue = "stepDefinitions",
        dryRun = false, // Cross check every feature file step is contains a correspondence step data or not
        monochrome = true ,
        plugin = {"pretty" , "html:test-output"}
        //tags = {"@sanity"}
)

public class testRunner
{

}
