package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MouseHoverTofields {
	WebDriver driver =null;
	@Given("I want to navigate to Account&Signs")
	public void i_want_to_navigate_to_account_signs() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@Given("Navigate to Your Lists")
	public void navigate_to_your_lists() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(60));
		WebElement a1=w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))));
	  Actions a =new Actions(driver);
	  
	  a.moveToElement(a1).build().perform();
	  
	  WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(30));
	  
	  WebElement a2= w1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='nav-al-wishlist']/a[3]"))));
	  a.moveToElement(a2).click().build().perform();
	}
	@Then("click Baby Wishlist")
	public void click_baby_wishlist() {
	    driver.quit();
	}



}
