package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton = driver.findElement(By.id("alertButton"));
		simplealertbutton.click();
		Alert al = driver.switchTo().alert();    // To switch the control from webpage to popup(alert box)
		al.accept();    //  From the Alertbox, if we are selecting OK means we use accept()
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalertbutton = driver.findElement(By.id("confirmButton"));
		confirmalertbutton.click();
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();  //From the Alertbox, if we are selecting Cancel button means we use dismiss()
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalertbutton = driver.findElement(By.id("promtButton"));
		promptalertbutton.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Testing popup");
		al.accept();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertobj = new AlertHandling();
		alertobj.browserLaunch();
		//alertobj.verifySimpleAlert();
		//alertobj.verifyConfirmAlert();
		alertobj.verifyPromptAlert();
	}

}
