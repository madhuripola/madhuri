package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "C:\\Users\\lalitha madhuri\\Documents\\batch03\\sdetpom\\src\\test\\resources\\Features" },

		glue = "cucumberSteps",
		stepNotifications = true,
		tags = "~@Smoke or @Regression",
		plugin = { "pretty","html:NCReport.html" })

public class TestRunner {

}
