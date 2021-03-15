package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



public class HomePage {

	
	public HomePage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	

	
	@FindBy (xpath = "(//img[@class='fancytree-icon'])[1]")
	public WebElement onlinehome;
	
	@FindBy (linkText  = "Login")
	public WebElement login;
	
	@FindBy (id = "MKUserName")
	public WebElement userID;
	
	@FindBy (id="Submit")
	public WebElement submitbutton;
	
}

