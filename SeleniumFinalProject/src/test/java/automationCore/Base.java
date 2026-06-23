package automationCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constants;
import utilities.ScreenshotUtility;

public class Base {
	Properties prop;
	FileInputStream file;
	public WebDriver driver;  // WebDriver declaration
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void browserLaunch(String browser) throws Exception {
		prop=new Properties();
		file=new FileInputStream(Constants.Configfile);
		prop.load(file);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver(); // To call browser open
		} 
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("Invalid Browser");
		}
		 
		driver.get(prop.getProperty("url"));  // To open the Url
		driver.manage().window().maximize();   //To open the browser in maximise the window 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@AfterMethod(alwaysRun=true)
	public void browserClose(ITestResult itest) throws IOException {    
		if(itest.getStatus()==ITestResult.FAILURE) {
			ScreenshotUtility screenshot = new ScreenshotUtility();
			screenshot.getScreenshot(driver, itest.getName());
		}
		//driver.quit();
	}
}
