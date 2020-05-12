package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class OrderFood_StepDefinition {
	@Given("^I want food in \"([^\"]*)\"$")
	public void i_want_food_in(String arg1) throws Throwable {
	    String URL = "http://www.just-eat.co.uk/";
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='Form_c-search-input_3ySg3']")).sendKeys("AR51 1AA");
	    throw new PendingException();
	}

	@When("^I search for restaurants$")
	public void i_search_for_restaurants() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new PendingException();
	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^restaurants are open in my area$")
	public void restaurants_are_open_in_my_area() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Pizza Hut - Shell Menu restaurant is open$")
	public void pizza_Hut_Shell_Menu_restaurant_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Check restaurant should have delivery option$")
	public void check_restaurant_should_have_delivery_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Pizza Hut - Shell Menu restaurant has (\\d+) and above rating$")
	public void pizza_Hut_Shell_Menu_restaurant_has_and_above_rating(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select meal$")
	public void select_meal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Meal should be added to Basket$")
	public void meal_should_be_added_to_Basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
