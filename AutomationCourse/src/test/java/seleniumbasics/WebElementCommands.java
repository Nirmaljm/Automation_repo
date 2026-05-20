package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	public void verifyWebElement() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");  // Go to Input Form Page 
	WebElement messageBox = driver.findElement(By.id("single-input-field"));  //Locating using textbox 
	// For reusing we need to use WebElement infront of driver. So we need to import
	
	//sendkeys() --> To input a text in a field 
	messageBox.sendKeys("Hello Test");
	
	//click()  --> to click the button
	WebElement showMessageButton = driver.findElement(By.id("button-one"));
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
