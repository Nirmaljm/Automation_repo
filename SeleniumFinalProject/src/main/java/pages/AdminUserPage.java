package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserPage {
	
	public WebDriver driver;
	
	PageUtility utility = new PageUtility();

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' New']") WebElement new_button;
	@FindBy(id="username") WebElement username_field;
	@FindBy(id="password") WebElement password_field;
	@FindBy(id="user_type") WebElement usertype_dropdown;
	@FindBy(xpath="//button[@type='submit' and @name='Create']") WebElement save_button;
	
	@FindBy(xpath="//a[text()=' Search']") WebElement search_button;
	@FindBy(id="un") WebElement username_on_searchclick;
	@FindBy(id="ut") WebElement usertype_dropdown_on_search;
	@FindBy(xpath="//button[@value='sr']") WebElement search_button_under_searcharea;
	
	@FindBy(xpath="//i[@class='ace-icon fa fa-sync-alt']") WebElement reset_button;
	
	//Assertion
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement new_button_assertion;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search_button_assertion;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement reset_button_assertion;
	
	//New Button
	public AdminUserPage clickOnNewButton() {
		new_button.click();
		return this;
	}
	
	public AdminUserPage enterUsernameOnUsernameField(String usernamevalue1) {
		username_field.sendKeys(usernamevalue1);
		return this;
	}

	public AdminUserPage enterPasswordOnPasswordField(String passwordvalue1) {
		password_field.sendKeys(passwordvalue1);
		return this;
	} 
	
	public AdminUserPage clickUserTypeDropdown() {
		//Select select = new Select(usertype_dropdown);
		//select.selectByIndex(1); 
		utility.selectDropdownByIndex(usertype_dropdown, 1);
		return this;
	} 
	
	public AdminUserPage clickSaveButton() {
		save_button.click();
		return this;
	}
	
	//Search Button
	public AdminUserPage clickOnSearchButton() {
		search_button.click();
		return this;
	}
	
	public AdminUserPage enterUsernameOnUsernameFieldInSearchArea(String usernamevalue2) {
		username_on_searchclick.sendKeys(usernamevalue2);
		return this;
	}
	
	public AdminUserPage clickUserTypeOnSearchArea() {
		//Select select2 = new Select(usertype_dropdown_on_search);
		//select2.selectByIndex(1);
		utility.selectDropdownByIndex(usertype_dropdown_on_search, 1);
		return this;
	}
	
	public AdminUserPage clickSearchButtonUnderSearchArea() {
		search_button_under_searcharea.click();
		return this;
	}
	
	//Reset Button
	public AdminUserPage clickResetButton() {
		reset_button.click();
		return this;
	}
	
	//Assertion
	public boolean isNewButtonDisplayed() {
		return new_button_assertion.isDisplayed();
	}
	
	public boolean isSearchButtonEnabled() {
		return search_button_assertion.isEnabled();
	}
	
	public boolean isResetButtonEnabled() {
		return reset_button_assertion.isEnabled();
	}
}
