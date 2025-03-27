package runner;  

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Step;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
    plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	 @BeforeClass(alwaysRun = true)
	    @Step("Initializing test setup")  
	    public void setUpClass() {
	        System.out.println("Test setup started...");
	    }

	    @AfterClass(alwaysRun = true)
	    @Step("Cleaning up after tests")  
	    public void tearDownClass() {
	        System.out.println("Test cleanup completed.");
	    }
}
