package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	HomePage home;
	//Verify Valid Username & Password
	@Test(priority=1,description="Validating User Login with Valid Ceredentials",groups= {"smoke"})
	public void verifyUserLoginWithValidCeredentials() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//Assertion
		boolean dashboarddisplay = login.isDashboradDisplayed();
		Assert.assertTrue(dashboarddisplay, Constants.ValidCeredentialError);
	}
	
	//Valid Username & Invalid Password
	@Test(priority=2,description="Validating User Login with Valid Username & Invalid Password")
	public void verifyUserLoginWithValidUsernameInvalidPassword() throws IOException {
	
		String usernamevalue =  ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnLoginButton();
		
		//Assertion
		String actual = login.isHeadingDispalyed();
		String expected ="7rmart supermarket";
		Assert.assertEquals(actual, expected,Constants.InvalidPasswordError);
	}
	
	//Invalid Username & Valid Password
	@Test(priority=3,description="Validating User Login with InValid Username & Valid Password")
	public void verifyUserLoginWithInValidUsernameValidPassword() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(2, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnLoginButton();
		
		//Assertion
		String actual = login.isLoginFormHeadingDispalyed();
		String expected ="Sign in to start your session";
		Assert.assertEquals(actual, expected,Constants.InvalidUsernameError);
	}
	
	//Invalid Ceredentials
	@Test(priority=4,description="Validating User Login with InValid Ceredentials",groups= {"smoke"},dataProvider = "loginProvider")
	public void verifyUserLoginWithInValidUsernameInvalidPassword(String usernamevalue,String passwordvalue) throws IOException {
		
		//String usernamevalue =  ExcelUtility.getStringData(3, 0, "LoginPage");
		//String passwordvalue =  ExcelUtility.getStringData(3, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnLoginButton();
		
		//Assertion
		boolean signinbutton = login.isRemembermeSelected();
		Assert.assertFalse(signinbutton, Constants.InvalidCeredentialError);
		
	}
	
	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
		};
	}
	
}
