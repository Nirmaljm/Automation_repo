package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{

	public void verifyWebElement() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");  // Go to Input Form Page 
	WebElement messageBox = driver.findElement(By.id("single-input-field"));  //Locating using textbox 
	// For reusing we need to use WebElement infront of driver. So we need to import
	
	//sendkeys() --> To input a text in a field 
	messageBox.sendKeys("Hello Test");
	
	//click()  --> to click the button
	WebElement showMessageButton = driver.findElement(By.id("button-one"));
	System.out.println(showMessageButton.isDisplayed());
	System.out.println(showMessageButton.isEnabled());
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
	Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fluent.until(ExpectedConditions.elementToBeClickable(showMessageButton));
	showMessageButton.click();
	
	//clear() --> to clear the text from the textbox
	messageBox.clear();
	
	//getText() --> To fetch the text in webpage
	WebElement message = driver.findElement(By.id("message-one"));
	System.out.println(message.getText());
	
	//getTagname() --> to fetch the tagname of an element 
	System.out.println(showMessageButton.getTagName());
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands = new WebElementCommands();
		commands.browserLaunch();    // for launch the website
		commands.verifyWebElement();
		
	}

}
