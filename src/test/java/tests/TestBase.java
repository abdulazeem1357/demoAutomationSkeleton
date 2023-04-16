package tests;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class TestBase extends AbstractTestNGCucumberTests {
    private WebDriver driver;
    protected static LoginPage loginPage;
    public void setupChromeDriver() {
        driver = WebDriverManager.firefoxdriver().create();
        driver.manage().window().maximize();
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void beforeScenario(Scenario scenario) {
        pageInitializer();
        System.out.println("We are executing scenario name: " + scenario.getName());
    }

    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario status: " + scenario.getStatus());
    }

    private void pageInitializer() {
        if (driver!=null) {
            loginPage = new LoginPage(driver);
        }
    }

}
