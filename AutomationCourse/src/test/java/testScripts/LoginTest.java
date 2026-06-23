package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	
	//Test Case: Verify Valid Username & Password
	
	@Test
	public void verifyUserLoginWithValidCeredentials() throws IOException {
		//WebElement username = driver.findElement(By.id("user-name"));
		//username.sendKeys("standard_user");
		
		//WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
	
		//WebElement login_button = driver.findElement(By.id("login-button"));
		//login_button.click();
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameInvalidPassword() throws IOException {
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_user");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce1");
//	
//		WebElement login_button = driver.findElement(By.id("login-button"));
//		login_button.click();
		
		String usernamevalue =  ExcelUtility.getStringData(1, 0, "LoginPage");
		//System.out.println(usernamevalue);
		String passwordvalue =  ExcelUtility.getStringData(1, 1, "LoginPage");
		//System.out.println(passwordvalue);
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameValidPassword() throws IOException {
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_us");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce");
//	
//		WebElement login_button = driver.findElement(By.id("login-button"));
//		login_button.click();
//		
		
		String usernamevalue =  ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(2, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}

	@Test
	public void verifyUserLoginWithInvalidCeredentials() throws IOException {
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce23");
//	
//		WebElement login_button = driver.findElement(By.id("login-button"));
//		login_button.click();
		
		String usernamevalue =  ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(3, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
}
