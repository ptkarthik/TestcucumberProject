package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDefinitions {
	  WebDriver driver = null;
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	}
	@When("user clicks the search box")
	public void user_clicks_the_search_box() {
	    driver.findElement(By.name("q")).click();
	   
	}
	@When("types the search term as {string}")
	public void types_the_search_term_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results for Agniprasath")
	public void the_user_should_see_the_search_results_for_agniprasath() {
	    // Write code here that turns the phrase above into concrete actions
	boolean a= driver.findElement(By.xpath("//input[@value='Agniprasath']")).isDisplayed();
	    if(a)
	    {
	    	System.out.println("program is pass");
	    }
	    else 
	    {
	    	System.out.println("program fails");
	}

	driver.quit();




}}
