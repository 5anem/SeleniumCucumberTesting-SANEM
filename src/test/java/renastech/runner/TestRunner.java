package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech/Steps_Definitions",
        tags = "@Maping",
        dryRun= false             // it will check if there is undifianed staps definitions


)
public class TestRunner {
}



// 2 things
   // RunWith     -- > JUnit   -- Cucumber works with JUnit by default
   // Cucumber options