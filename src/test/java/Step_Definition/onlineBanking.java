package Step_Definition;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class onlineBanking {
	@Given("I am on home page")
	public void i_am_on_home_page() {
		 Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		
	     Driver.getDriver().manage().window().maximize();
		 Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	}

	@When("Click on Online Banking Home")
	public void click_on_Online_Banking_Home() {
	   HomePage homepage = new HomePage();
	  // homepage.commercialAuto.click();
	   if(homepage.onlinehome.isSelected()) {
		   homepage.onlinehome.click();
		   
		 
			String actualOnlineBankingTitle =Driver.getDriver().getTitle();
			
			String expectedOnlineBankingTitle="Online Banking Features";
			Assert.assertEquals(actualOnlineBankingTitle, expectedOnlineBankingTitle);
			
	   }
		   
	}

	@When("Click on Login")
	public void click_on_Login() {
		HomePage homepage = new HomePage();
		homepage.login.click();
		
		String actualloginButtonTitle = Driver.getDriver().getTitle();
		System.out.println(actualloginButtonTitle);
		String expectedLoginButtonTitle="Login";
		Assert.assertEquals(actualloginButtonTitle,expectedLoginButtonTitle);
		
		
		
	   
	}

	@When("Enter username")
	public void enter_username() {
		HomePage homepage = new HomePage();
		homepage.userID.sendKeys("nazim");
		
	   
	}

	@Then("Click on Submit button")
	public void click_on_Submit_button() {
		HomePage homepage = new HomePage();
		homepage.submitbutton.click();
		 Driver.closeDriver();
	   
	}
	 

	
}