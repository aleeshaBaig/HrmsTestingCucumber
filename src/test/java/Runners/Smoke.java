package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/AddEmployee.feature",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@datatable",
        plugin = {"pretty","html:target/cucumber.html"}

)



public class Smoke {
}
