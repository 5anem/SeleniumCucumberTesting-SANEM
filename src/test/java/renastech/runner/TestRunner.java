package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech.Steps_Definitions",
        tags = "@Excel",
        dryRun= false,             // it will check if there is undifianed staps definitions
        plugin ={  "pretty",
                    "html:target/default-cucumber-reports.html",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
        }
//        publish = true,       // It will share your HTML report in Cucumber server, you can see your report online
//        monochrome = true     // It will provide more details in the console

        //Before method
        //Setup driver
        //max the browser
        //implicit wait
        //we get the url

        //After method
        //TearDown ----- Close the driver ---- Quite the driver
        //ScreenShot
        //Report

        //After ve Before methodun gerekcelerini Hooks classsta yapiyoruz


)
public class TestRunner {
}

