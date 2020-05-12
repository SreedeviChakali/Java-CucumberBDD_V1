package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Step { 
	WebDriver driver;


	@Given("^I want food in \"(.*?)\"$")
	public void i_want_food_in(String arg1)  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\cchimman\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		String URL = "http://www.just-eat.co.uk/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='Form_c-search-input_3ySg3']")).sendKeys("AR51 1AA");

	}

	@When("^I search for restaurants$")
	public void i_search_for_restaurants() {
		driver.findElement(By.xpath("//*[@class='Form_c-search-btn-text_6RDDX']")).click();

	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in(String arg1) {
		String SearchCount = driver.findElement(By.xpath("//*[@class='c-searchHeader']/span[2]")).getText();
		String[] SplitString = SearchCount.split(" ");
		System.out.println("Number of restaurants open currently:");
		System.out.print(SplitString[0]);
	   
	}

	@Given("^restaurants are open in my area$")
	public void restaurants_are_open_in_my_area() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='c-locationHeader-container']")).getText().contains("AR51 1AA");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//label[contains(text(),'Open now')]")).click();
	  
	}

	@When("^Pizza Hut - Shell Menu restaurant is open$")
	public void pizza_Hut_Shell_Menu_restaurant_is_open()  {
		driver.findElement(By.xpath("//input[@id='dish-search']")).sendKeys("Pizza Hut - Shell Menu");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
	}

	@Then("^Check restaurant should have delivery option$")
	public void check_restaurant_should_have_delivery_option()  {
		 String Restaurant_name = driver.findElement(By.xpath("//div[@class='c-listing-item-info']/h3")).getText();
	}

	@When("^Pizza Hut - Shell Menu restaurant has (\\d+) and above rating$")
	public void pizza_Hut_Shell_Menu_restaurant_has_and_above_rating(int arg1)  {
		driver.findElement(By.xpath("//div[@class='c-listing-item-info']/h3")).click();
	}

	@Then("^Select meal$")
	public void select_meal()  {
		driver.findElement(By.xpath("//*[@class='products']/child::div[2]/child::div[2]/div/form")).click();
	}

	@Then("^Meal should be added to Basket$")
	public void meal_should_be_added_to_Basket()  {
		 driver.findElement(By.xpath("//button[@class='checkoutButton']")).isEnabled();
	}



}
