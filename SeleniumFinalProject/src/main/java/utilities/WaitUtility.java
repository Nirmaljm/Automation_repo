package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
 public static int explicitwait=5;
 
	public void waitUntilElementToBeClickable(WebDriver driver,WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementToBeSelected(WebDriver driver,WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		 wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void waitUntilNumberOfElementsToBe(WebDriver driver,Integer element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		 wait.until(ExpectedConditions.numberOfElementsToBe(null, element));
	}
	
	public void waitUntilPresenceOfAllElementsLocatedBy(WebDriver driver,WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
	}
	
	public void waitUntilTitleContains(WebDriver driver,String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void waitUntilvisibilityOf(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
 
 
	
}
