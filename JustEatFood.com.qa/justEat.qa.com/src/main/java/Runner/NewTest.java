package Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\cchimman\\eclipse-workspace\\JustEatFood.com.qa\\justEat.qa.com\\src\\main\\Features",
glue= {"StepDefinitions/OrderFood_stepDef"},
plugin = 
{"pretty", "html:target/cucumber"},dryRun = true
//format=("pretty"'html:test-output')
)
public class NewTest {


}
