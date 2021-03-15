package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private Driver() {};
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			String browser = ConfigReader.getConfiguration("browser");
			switch(browser) {
			case "chrome": 
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			
			case "firefox": 
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			
			
				
			
				
			
			
			}
			
			
		}
		return driver;
	}
	
		
	
	
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver = null; 
		}
	}
	

}
