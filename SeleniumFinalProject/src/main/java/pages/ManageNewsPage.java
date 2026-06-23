package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' New']") WebElement new_button_news_page;
	@FindBy(id="news") WebElement  enter_news_field;
	@FindBy(xpath="//button[@type='submit']") WebElement save_button_news_page;
	
	@FindBy(xpath="//a[text()=' Search']") WebElement search_button_news_page;
	@FindBy(xpath="//input[@name='un']") WebElement search_news_title;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']") WebElement search_button_under_search_news_section;
	
	@FindBy(xpath="//i[@class='ace-icon fa fa-sync-alt']") WebElement reset_button_under_new_page;
	
	//Assertion
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert_msg_news_created;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search_button_assertion;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement reset_button_assertion;
	
	
	//New Button
	public ManageNewsPage clickNewButtonOnNewsPage() {
		new_button_news_page.click();
		return this;
	}
	
	public ManageNewsPage enterNewsOnNewArea(String news) {
		enter_news_field.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage clickSaveButtonOnNewsPage() {
		save_button_news_page.click();
		return this;
	}

	//Search
	public ManageNewsPage clickSearchButtonOnNewsPage() {
		search_button_news_page.click();
		return this;
	}
	
	public ManageNewsPage enterNewTitleInSearchArea(String news) {
		search_news_title.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage clickSearchButtonunderSearchNewsSection() {
		search_button_under_search_news_section.click();
		return this;
	}

	//Reset
	public ManageNewsPage clickResetButtonOnNewsPage() {
		reset_button_under_new_page.click();
		return this;
	}
	
	//Assertion
	public boolean isAlertMsgSuccessEnabled() {
		return alert_msg_news_created.isEnabled();
	}
	
	public boolean isSearchButtonEnabled() {
		return search_button_assertion.isEnabled();
	}
	
	public boolean isResetButtonEnabled() {
		return reset_button_assertion.isEnabled();
	}
}
