package StepDefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonSite {

	
		
		WebDriver driver=null;
		// TODO Auto-generated method stub

		@Given("Open Amazon site")
		public void open_amazon_site() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
		    
		 
		}
		@Given("give products details on search tab")
		public void give_products_details_on_search_tab() {
		    // Write code here that turns the phrase above into concrete actions
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']"))).sendKeys("OnePlus");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
		}
		@Then("validate the product search results")
		public void validate_the_product_search_results() {
		    
			int pagescount;
			String phonenamesstring=null;
			List <WebElement> phonenames = null;
			List<String> s= s=new ArrayList();
			pagescount= driver.findElements(By.xpath("//div[@role='navigation']/span/a")).size();
			System.out.println(pagescount);
			for(int i=2;i<=pagescount;i++)
			{
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='navigation']/span/a["+i+"]"))).click();
				WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(30));
			String pagenumber=	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='navigation']/span/a["+i+"]"))).getText();
			System.out.println("the page number is "+pagenumber);
				WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(30));
				wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2//a[contains(@href,'OnePlus')] ")));
				phonenames =driver.findElements(By.xpath("//h2//a[contains(@href,'OnePlus')] "));
				
			for(WebElement j:phonenames)
			{
			s.add(j.getText());
			}
				 for(String kk:s)
				 {
				 if(!kk.contains("OnePlus"))
					{
					 System.out.println("Phone name doesnt have oneplus but other fields have :"+" "+kk);
					 continue;
					
					}
					
					else
					{
						System.out.println("Phone name is"+" "+kk);
					} 
				 
				
;			}
			}
				
			}	
			
			
		
		@Then("check if there are relevant products")
		public void check_if_there_are_relevant_products() {
		    
		}



}

