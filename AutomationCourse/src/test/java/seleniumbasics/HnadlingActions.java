package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HnadlingActions extends Base{
	
	public void verifyMouseHover() {
		WebElement mousehoverbtn = driver.findElement(By.id("others"));
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HnadlingActions handlingobj = new HnadlingActions();
		handlingobj.browserLaunch();
		//handlingobj.verifyMouseHover();
		//handlingobj.verifyRightClick();
		handlingobj.verifyDragandDrop();

	}

}
