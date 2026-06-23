package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void fileUploadUsing_Sendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");		
		
		WebElement choosefile_btn = driver.findElement(By.id("uploadfile_0"));   // pointing to file upload
		
		choosefile_btn.sendKeys("C:\\Users\\NirmalJM\\git\\Automation_repo\\AutomationCourse\\src\\test\\resources\\sample.pdf");
		
		WebElement checkBox = driver.findElement(By.id("terms"));  // pointing to checkbox
		checkBox.click();
		
		WebElement submitButton = driver.findElement(By.id("submitbutton"));  //pointing to submit button
		submitButton.click();
	}
	
	/* In some cases sendkeys() won't work, so we can use Robot class()
	 * 
	 */
	public void fileUploadUsing_Robotclass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement fileupload_Button = driver.findElement(By.id("pickfiles"));    // pointing to submit file button
		fileupload_Button.click();
		
		/*StringSelection --> predefined class. We need to import
		 * Used to select the text.
		 */
		StringSelection selectionobj = new StringSelection("C:\\Users\\NirmalJM\\git\\Automation_repo\\AutomationCourse\\src\\test\\resources\\sample.pdf");
		
		//Copy & paste to the clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectionobj, null);
		
		Robot robotobj = new Robot();
		robotobj.delay(2500);   // to delay the process in milliseconds
		
		/*This is to pointing the cursor to the exact page */
		robotobj.keyPress(KeyEvent.VK_ENTER);  // VK - Virtual key
		robotobj.keyRelease(KeyEvent.VK_ENTER);
		
		robotobj.keyPress(KeyEvent.VK_CONTROL);  // For Paste
		robotobj.keyPress(KeyEvent.VK_V);
		
		robotobj.keyRelease(KeyEvent.VK_CONTROL);  // we are realsing the button
		robotobj.keyRelease(KeyEvent.VK_V);
		
		robotobj.keyPress(KeyEvent.VK_ENTER);  // After copy & paste, there will be a  'open folder' button
		robotobj.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileUpload = new HandlingFileUpload();
		fileUpload.browserLaunch();
		//fileUpload.fileUploadUsing_Sendkeys();
		try {
			fileUpload.fileUploadUsing_Robotclass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
