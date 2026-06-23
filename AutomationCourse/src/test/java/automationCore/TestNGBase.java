package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	
	public WebDriver driver;  // WebDriver declaration
	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();  // To call browser open
		driver.get("https://www.saucedemo.com/");  // To open the Url
		driver.manage().window().maximize();   //To open the browser in maximise the window 
		
	}

	@AfterMethod
	public void browserClose() {      
		//driver.quit();
	}
}
