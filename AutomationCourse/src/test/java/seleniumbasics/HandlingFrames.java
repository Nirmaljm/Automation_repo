package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void verify_Frames() {
		driver.navigate().to("https://demoqa.com/frames");
		
		/* findElements -> using to count the no.of <iframes>
		 * 
		 */
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());  // to check the total no.of frames
		
		// We need to switch the Control
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeading.getText());
		
		// Go back the switch
		driver.switchTo().defaultContent();      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames = new HandlingFrames();
		frames.browserLaunch();
		frames.verify_Frames();
	}

}
