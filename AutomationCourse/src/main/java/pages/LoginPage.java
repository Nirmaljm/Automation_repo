package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor Creation - constructor name should be same as Classname
	public LoginPage(WebDriver driver) {
		//If both local & instance variables having same name then we need to represent as this method.
		this.driver = driver;
		//PageFactory - predefined class. Inside this class there is a method called initElements
		//initElements - If we call initElements then only we can call WebElements. 
		PageFactory.initElements(driver,this);
	}
	/*  Annotations used in PageFactory - @FindBy.
	 * @FindBy - used to create WebElements.
	 * Here only we have to do WebElement
	 */
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement login_button;
	
	

	public void enterUsernameOnUsernameField(String usernamevalue) {
		username.sendKeys(usernamevalue);
	} 
	
	public void enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
	} 

	public void clickOnLoginButton() {
		login_button.click();
	}
}
