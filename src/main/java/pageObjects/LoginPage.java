package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void enterUserName(String userName) {
        clear(userNameField);
        sendKeys(userNameField, userName);
    }

    public void enterPassword(String userPassword) {
        clear(passwordField);
        sendKeys(passwordField, userPassword);
    }

    public void clickLoginButton() {
        click(submitButton);
    }

    public void visitLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
}
