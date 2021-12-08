package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="@target/rerun.txt",
        glue = "renastech.Steps_Definitions",
     //   tags = "@Smoke_Testing",
        dryRun= false,             // it will check if there is undifianed staps definitions
        plugin ={  "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }


)
public class FailedRunner {
}
