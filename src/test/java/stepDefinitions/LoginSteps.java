package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage login;
    
    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();  
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        login = new LoginPage(driver);
    }
    
    @When("User enters username and password")
    public void user_enters_credentials() throws InterruptedException {
    	Thread.sleep(2000);
        login.enterUsername("admin");
        login.enterPassword("password");
        login.clickLogin();
    }
    
}
