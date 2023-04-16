package runners;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = {"src/test/resources/features/Login.feature"},
glue = {"steps"})
public class TestRunner extends TestBase {
}
