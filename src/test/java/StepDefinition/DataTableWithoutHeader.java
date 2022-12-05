package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeader {
WebDriver driver;
	@Given("user should login into orange website")
	public void user_should_login_into_orange_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(10000);
	}
	@When("user shoulg give username and password as below")
	public void user_shoulg_give_username_and_password_as_below(io.cucumber.datatable.DataTable dataTable) {
	  List<List<String>> ls= dataTable.asLists(String.class);
	 String username=ls.get(0).get(0);
	 String password=ls.get(0).get(1);
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("user should see the home page")
	public void user_should_see_the_home_page() throws InterruptedException {
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
