package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesPrograms {
	WebDriver driver;
	@Given("Exuser should login into orange website")
	public void exuser_should_login_into_orange_website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(10000);
	}
	@When("Exuser shoulg give {string} and {string} as below")
	public void exuser_shoulg_give_and_as_below(String string, String string2) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2); 
	}
	@When("Exuser should click the login button")
	public void exuser_should_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("Exuser should see the home page")
	public void exuser_should_see_the_home_page() throws InterruptedException {
		Thread.sleep(10000);
	    // Write code here that turns the phrase above into concrete actions
	   String a= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']/span")).getText();
	   System.out.println(a);
	   if(a.equals("Dashboard"))
	   {
		   System.out.println("Pass");
	   }
	   
	   else
	   {
		   System.out.println("Fail");
	   }
	   driver.quit();
	}



	
}
