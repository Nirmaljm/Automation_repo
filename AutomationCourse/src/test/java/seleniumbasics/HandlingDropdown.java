package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	/* For Dropdown Selection */
	public void verifyDropdown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
		WebElement dropdown2 = driver.findElement(By.id("dropdowm-menu-2"));
		WebElement dropdown3 = driver.findElement(By.id("dropdowm-menu-3"));
		
		//Creating an object for predefined class 'Select'
		Select select1 = new Select(dropdown1);    //We need to import Select
		select1.selectByIndex(1);    // Using selectByIndex()
	
		Select select2 = new Select(dropdown2);
		select2.selectByValue("testng");     //Using selectByValue()
		
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("CSS");   //Using selectByVisibleText()
	}

	/* For Checkbox Selection */
	public void verifyCheckBox() {
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox1.click();
	}
	
	/* For RadioButton Selection */
	public void verifyRadioButton() {
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='yellow']"));
		radiobutton.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown down = new HandlingDropdown();
		down.browserLaunch();
		down.verifyDropdown();
		down.verifyCheckBox();
		down.verifyRadioButton();
	}

}
