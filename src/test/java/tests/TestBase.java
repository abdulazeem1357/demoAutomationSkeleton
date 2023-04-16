package tests;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class TestBase extends AbstractTestNGCucumberTests {

    protected WebDriver driver;
    protected LoginPage loginPage;

    public void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
    }

    public void beforeScenario(Scenario scenario) {
        initializePages();
        System.out.println("We are executing scenario name: " + scenario.getName());
    }

    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario status" + scenario.getStatus());
    }

    public void initializePages() {
        loginPage = new LoginPage(driver);
    }

}
