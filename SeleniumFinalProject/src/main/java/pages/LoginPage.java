package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	//@FindBy(xpath="//label[@for='remember']") WebElement remember_me;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin_button;
	
	//Assertion
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement heading;
	@FindBy(xpath="//p[text()='Sign in to start your session']") WebElement loginform_heading;
	@FindBy(xpath="//label[@for='remember']") WebElement remember_me;
	

	public LoginPage enterUsernameOnUsernameField(String usernamevalue) {
		username.sendKeys(usernamevalue);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
		return this;
	}
	 
	public HomePage clickOnLoginButton() {
		WaitUtility wait = new WaitUtility();
		wait.waitUntilElementToBeClickable(driver, signin_button);
		signin_button.click();
		return new HomePage(driver);
	}
	
	//Assertion
	public boolean isDashboradDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public String isHeadingDispalyed() {
		return heading.getText();
	}

	public String isLoginFormHeadingDispalyed() {
		return loginform_heading.getText();
	}
	
	public boolean isRemembermeSelected() {
		return remember_me.isSelected();
	}
	

}
