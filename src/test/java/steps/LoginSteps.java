package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

public class LoginSteps extends TestBase {
    @Given("The user is already registered")
    public void theUserIsAlreadyRegistered() {
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("I enter the user name {string}")
    public void iEnterTheUserName(String userName) {
        loginPage.enterUserName(userName);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String userPassword) {
        loginPage.enterPassword(userPassword);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
    }
}
