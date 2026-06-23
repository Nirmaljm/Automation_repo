package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* We are using framework -TestNG*/

	public class TestNG_Annotations {
	@Test
	public void sampleTestCase() {
		System.out.println("Sample Test Case");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Sample Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Sample After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Sample After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample Before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Sample After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Sample Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample After Suite");
	}
}
