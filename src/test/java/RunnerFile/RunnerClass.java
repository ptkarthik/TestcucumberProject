package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeautureFiles/MouseHoverToFields.feature/", glue={"StepDefinition","hooks"},monochrome=true,dryRun=false
)
public class RunnerClass {

}
