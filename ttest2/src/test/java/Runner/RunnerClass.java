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
     //   plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome=true

    
)


public class RunnerClass {

}
