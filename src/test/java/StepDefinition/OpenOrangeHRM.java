package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenOrangeHRM {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(10000);
	}
	@When("The User Enter the Valid UserName and Password")
	public void the_user_enter_the_valid_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	@When("Clicks on the Login Button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("User should be able to Navigate to HomePage")
	public void user_should_be_able_to_navigate_to_home_page() throws InterruptedException {
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
