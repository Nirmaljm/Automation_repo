package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators() {
		driver.findElement(By.id("button-two")); // Using Id locator
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));   // 'className' is another type of Locator
		driver.findElement(By.tagName("button"));     // 'tagName' is another type of Locator
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo")); // Link Text
		driver.findElement(By.partialLinkText("Simple Form")); // Partial Link Text
		
		/*Using Css locator 
		 * Syntax : tagname[attribute='attributevalue']
		 */
		driver.findElement(By.cssSelector("button[id='button-one']"));  
		
		/*Absolute xpath - Since it starts from root node
	//	/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button   */
		
		
		/*Relative xpath
		 * Synax :  //tagname[@attribute='attributevalue']
		 			//  -> current node(target element)
		 			@   -> attribute selection
		 */
		driver.findElement(By.xpath("//button[@id='button-one']"));  
		
		/*Relative xpath  Using text()  
		    Syntax:  //tagname[text()='textname']
		 * */
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		/*  Using text with contains():
		Synatax: //tagname[contains(text(),'textname')]
		*/
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));
		
		/* AND : if more than 1 attribute for find an element, then we have to use AND ,OR.
		 *  Syntax :  //tagname[@attribute='attributevalue' and @attribute='attributevalue']
		 */
		driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
		
		
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		/* Using Xpath access method using Preceding
		Syntax:  //button[@id='button-one']//preceding:: div[@class='card']  */
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		
		/*Using Xpath access method using Ancestor
		Syntax:  //button[@id='button-one']//ancestor::div  */
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		/*Using Xpath access method using Descendant
		Syntax:  //div[@class='card']//descendant::div  */
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		//Here we will get the 5th element from the match
		driver.findElement(By.xpath("//div[@class='card']//descendant::div[5]"));
	}

}
