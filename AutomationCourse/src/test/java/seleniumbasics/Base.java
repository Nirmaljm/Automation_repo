package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;  // WebDriver declaration
	public void browserLaunch() {
		driver = new ChromeDriver();  // To call browser open
		driver.get("https://selenium.qabible.in/");  // To open the Url
		driver.manage().window().maximize();   //To open the browser in maximise the window 
		
	}
	
	public void browserClose() {      // To close the window automatically
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.browserLaunch();
		base.browserClose();

	}

}
