package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{

	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());   //Will fetch  all data from the table
		
		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[7]"));     // To fetch the data from particular row
		System.out.println(tablerow.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tableobj = new TableHandling();
		tableobj.browserLaunch();
		tableobj.verifyTable();
	}

}
