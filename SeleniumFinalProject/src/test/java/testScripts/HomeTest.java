package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
	HomePage home;//
	
	@Test(description="Validating User can able to Logout Successfully",retryAnalyzer=retrymechanism.Retry.class)
	public void verifyWhetherUserIsAbleToSuccessfullyLogout() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(10, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		home.clickOnAdminIcon();
		login=home.clickOnLogoutButton();
		
		//Assertion
		String actual = home.isLoginHeadingDispalyed();
		String expected ="7rmart supermarket";
		Assert.assertEquals(actual, expected,Constants.LogoutError);
		
	}
	
	
}
