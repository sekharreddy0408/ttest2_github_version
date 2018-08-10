package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format ={"pretty","html:target/cucumber"},
        features ="src//test//resource",
        glue = {"StepDefs"},
        monochrome=true

    
)


public class RunnerClass {

}
