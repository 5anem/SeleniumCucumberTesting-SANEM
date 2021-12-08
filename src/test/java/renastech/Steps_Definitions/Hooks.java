package renastech.Steps_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {



    //BeforeMethod
    // BeforeClass
    //Suite


    @Before
    public void setup(Scenario scenario) {
        System.out.println(":::(^_^) TEST EXECUTION START (*_*)");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
        Driver.closeDriver();
        System.out.println(":::(^_^) END OF TEST EXECUTION (*_*)");
    }



}
