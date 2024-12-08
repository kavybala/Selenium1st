package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        plugin = {"html:target/cucumber-reports/reports"},
        monochrome = true,
        tags = "@activity5"
)
public class Activityrunner {

}
