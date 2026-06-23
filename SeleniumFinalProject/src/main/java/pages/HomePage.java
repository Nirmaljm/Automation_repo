package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='img-circle']") WebElement admin_icon;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement logout_button;

	@FindBy(xpath="//a[@class='small-box-footer'][1]  ") WebElement admin_users_moreinfo_button;
	@FindBy(xpath="//p[text()='Manage News']")  WebElement  manage_news_more_info_button;
	
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement login_heading;
	
	
	public HomePage clickOnAdminIcon() {
		admin_icon.click();
		return this;
	}
	
	public LoginPage clickOnLogoutButton() {
		WaitUtility wait = new WaitUtility();
		wait.waitUntilElementToBeClickable(driver, logout_button);
		logout_button.click();
		return new LoginPage(driver);
	}
	
	public AdminUserPage clickAdminUserMoreInfoButton() {
		admin_users_moreinfo_button.click();
		return new AdminUserPage(driver);
	}
	
	public ManageNewsPage clickManageNewsMoreInfoButton() {
		manage_news_more_info_button.click();
		return new ManageNewsPage(driver);
	}
	
	//Assertion
	public String isLoginHeadingDispalyed() {
		return login_heading.getText();
	}
}
