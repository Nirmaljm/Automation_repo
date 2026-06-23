package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HnadlingActions extends Base{
	
	/* Mouse Actions : can be done based on mouse class
	 *   mouseHover, right click, Drag & drop
	 */
	public void verifyMouseHover() {
		WebElement mousehoverbtn = driver.findElement(By.id("others"));
		
		/* Actions --> predefined class, so we need to import
		 *  For mousehover we use moveToElement()
		 *  For any actions to perform we call 2 methods. that are mandatory : build() , perform()
		 */
		Actions actobj = new Actions(driver);      
		actobj.moveToElement(mousehoverbtn).build().perform();  
	}

	public void verifyRightClick() {
		WebElement mousehoverbtn = driver.findElement(By.id("others"));
		
		Actions actobj = new Actions(driver);
		actobj.contextClick(mousehoverbtn).build().perform();
	}
	
	public void verifyDragandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag_button = driver.findElement(By.id("draggable"));
		WebElement drop_button = driver.findElement(By.id("droppable"));
		
		Actions actobj = new Actions(driver);
		actobj.dragAndDrop(drag_button,drop_button).build().perform();
	}
	
	/* Shortcut keys like cut, copy, paste
	 * Robot -> predefined class, so we need to import
	 */
	public void verifyKeyboardActions() throws AWTException {
		Robot robotobj = new Robot();
		robotobj.keyPress(KeyEvent.VK_CONTROL);
		robotobj.keyPress(KeyEvent.VK_T);
		robotobj.keyRelease(KeyEvent.VK_CONTROL);
		robotobj.keyRelease(KeyEvent.VK_T);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HnadlingActions handlingobj = new HnadlingActions();
		handlingobj.browserLaunch();
		//handlingobj.verifyMouseHover();
		//handlingobj.verifyRightClick();
		//handlingobj.verifyDragandDrop();
		try {
			handlingobj.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
