package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutor extends Base{
	
	public void verifyJS() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement show_msg_btn = driver.findElement(By.id("button-one"));
		
		/*JavascriptExecutor is Interface. We need to import
		 *  For click() -->in some it won't work .So we are using Javascript Executor
		 */
		JavascriptExecutor js = (JavascriptExecutor)driver; // for interface we are creating ref variable
		js.executeScript("arguments[0].click();",show_msg_btn);
		
		//Scrolldown
		js.executeScript("window.scrollBy(0,350)", "");    //scroll up
		js.executeScript("window.scrollBy(0,-350)", "");     //scroll down
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSExecutor executor = new JSExecutor();
		executor.browserLaunch();
		executor.verifyJS();

	}

}
