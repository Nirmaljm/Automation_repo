package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base{
	HomePage home;
	ManageNewsPage newspage;
	
	@Test(description="Validating the User can able to Add new News")
	public void verifyWhetherAdminIsAbleToClickAddNewButtonOnManageNewsPage() throws IOException{
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		newspage=home.clickManageNewsMoreInfoButton();
		
		String news =  ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		
		//ManageNewsPage newspage = new ManageNewsPage(driver);
		newspage.clickNewButtonOnNewsPage().enterNewsOnNewArea(news).clickSaveButtonOnNewsPage();
		
		//Assertion
		boolean alertmsg = newspage.isAlertMsgSuccessEnabled();
		Assert.assertTrue(alertmsg, Constants.AddNewsError);

	}
	
	@Test(description="Validating the User can able to Search the News")
	public void verifyWhetherUserIsAbleToSearchNews() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		newspage=home.clickManageNewsMoreInfoButton();
		
		String news =  ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		
		//ManageNewsPage newspage = new ManageNewsPage(driver);
		newspage.clickSearchButtonOnNewsPage().enterNewTitleInSearchArea(news).clickSearchButtonunderSearchNewsSection();
		
		//Assertion
		boolean searchbutton = newspage.isSearchButtonEnabled();
		Assert.assertTrue(searchbutton,Constants.SearchNewsError);
	}
	
	
	@Test(description="Validating the User can able to Reset the News List")
	public void verifyWhetherUserIsAbleToClickRestButton() throws IOException {
		
		String usernamevalue =  ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue =  ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		home=login.clickOnLoginButton();
		
		//HomePage home = new HomePage(driver);
		newspage=home.clickManageNewsMoreInfoButton();
		
		//ManageNewsPage newspage = new ManageNewsPage(driver);
		newspage.clickResetButtonOnNewsPage();
		
		//Assertion
		boolean resetbutton = newspage.isResetButtonEnabled();
		Assert.assertTrue(resetbutton, Constants.ResetUserError);
	}

}


