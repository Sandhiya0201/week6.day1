package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
	public ChromeDriver driver;
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("Load the application url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@Given("Enter the username as {string}") //Demosalesmanager
	public void enterUsername(String UName) {
		driver.findElement(By.id("Username")).sendKeys("demosalesmanager");
		
	}
	@Given("Eenter the password as {string}") //crmsfa
	public void enterpassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on login button")
	public void clickloginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Then("Homepage should be displayed")
	public void verifypage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed)
		{
	            System.out.println("Error message should be displayed");
		}
		else {
			   System.out.print("Error message should be displayed");
		}

		
	    
	
	}
	

}
