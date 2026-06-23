package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	
	public void verifyMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");	
		String parentwindow = driver.getWindowHandle();  //1st window handle id
		WebElement clickhere_button = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere_button.click();
		Set<String>handleids = driver.getWindowHandles(); // to get multiple window handleids
		System.out.println(handleids);
		Iterator<String>it = handleids.iterator();
		while(it.hasNext()) {
			String currentid = it.next();
			if(!currentid.equals(parentwindow))  //
			{
				driver.switchTo().window(currentid);
				WebElement email_field = driver.findElement(By.xpath("//input[@name='emailid']"));
				email_field.sendKeys("test@gmail.com");
				WebElement submit_btn = driver.findElement(By.xpath("//input[@value='Submit']"));
				submit_btn.click();
			}
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindows = new MultipleWindowHandling();
		multiplewindows.browserLaunch();
		multiplewindows.verifyMultipleWindow();
	}

}
