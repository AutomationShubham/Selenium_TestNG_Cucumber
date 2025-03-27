package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    By username = By.xpath("//input[@type='text']");
    By password = By.xpath("//input[@type='password']");
    By loginButton = By.xpath("//button[@class='button--large is-round mb-3 mb-xl-6']");
    
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
}
