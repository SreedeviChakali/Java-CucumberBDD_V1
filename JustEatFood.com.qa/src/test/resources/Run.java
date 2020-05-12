 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Run { 
	
@RunWith(Cucumber.class)
@CucumberOptions(
features="OrderFoodFeature",
glue="OrderFood_StepDefinition",
plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
 
"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", "junit:target/cucumber-
results.xml"},
 
dryRun = false,
monochrome = true,
tags={"@Smoke,@Regression"}
)
 


}
