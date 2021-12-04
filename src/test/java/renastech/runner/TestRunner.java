package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech.Steps_Definitions",
        tags = "@Hook",
        dryRun= false             // it will check if there is undifianed staps definitions


)
public class TestRunner {
}



// 2 things
   // RunWith     -- > JUnit   -- Cucumber works with JUnit by default
   // Cucumber options



   // Before method
   // Setup the Driver
   // Max The Browser
   // implicit wait
   // we get the url




   // After Method
     // TearDown --- Close the driver --- Quite the driver
     // ScrrenShot
     // Report

























