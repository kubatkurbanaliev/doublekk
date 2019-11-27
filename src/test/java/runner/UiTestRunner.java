package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report", "pretty", "json:target/cucumber.json"},
        features = "src/test/resources/uiFeatures",
        glue = "stepDefs",
        dryRun = false,
        tags = "@TecTC-1015"
)

public class UiTestRunner {

}
