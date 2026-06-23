package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base{
	HomePage home;
	AdminUserPage adminuser;
	
	@Test(description="Validating the User can able to Add New User")
	public void verifyWhetherAdminIsAbleToAddNewUser() throws IOException{
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		adminuser=home.clickAdminUserMoreInfoButton();
		
		FakerUtility faker = new FakerUtility();
		
		String usernamevalue1 =  faker.createRandomUsername();
		String passwordvalue1 =  faker.createRandomPassword();
		
		//AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnNewButton().enterUsernameOnUsernameField(usernamevalue1).enterPasswordOnPasswordField(passwordvalue1).clickUserTypeDropdown().clickSaveButton();
		
		//Assertion
		boolean newbutton = adminuser.isNewButtonDisplayed();
		Assert.assertTrue(newbutton, Constants.AddNewUserError);
		
	}
	
	@Test(description="Validating the User can able to Search a User")
	public void verifyWhetherUserIsAbleToSearchAUser() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		adminuser=home.clickAdminUserMoreInfoButton();
		
		String usernamevalue2 =  ExcelUtility.getStringData(0, 0, "AdminUserPage");
		
		//AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnSearchButton().enterUsernameOnUsernameFieldInSearchArea(usernamevalue2).clickUserTypeOnSearchArea().clickSearchButtonUnderSearchArea();
		
		//Assertion
		boolean searchbutton = adminuser.isSearchButtonEnabled();
		Assert.assertTrue(searchbutton, Constants.SearchUserError);
		
	}
	
	@Test(description="Validating the User can able to Reset the list")
	public void verifyWhetherUserIsAbleToClickRestButton() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		adminuser=home.clickAdminUserMoreInfoButton();
		
		//AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickResetButton();
		
		//Assertion
		boolean resetbutton = adminuser.isResetButtonEnabled();
		Assert.assertTrue(resetbutton, Constants.ResetUserError);
	}

}


