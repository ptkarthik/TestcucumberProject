package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeautureFiles", glue={"StepDefinition","hooks"},monochrome=true,dryRun=false
,tags=("@Example"))
public class RunnerClass {

}
