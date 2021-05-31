package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		//table[contains(@class,'striped')]
		//rows= //table[contains(@class,'striped')]/tbody/tr
		//cols = //table[contains(@class,'striped')]/tbody/tr[1]/td
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
		
		System.out.println("No.of rows : " + rows.size());
		System.out.println("No.of cols : " + cols.size());
					
		List<WebElement> row3=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
	
		System.out.println("Printing row 3 data : ");
		
		for (WebElement e:row3)
		{
			System.out.println("cell value : " + e.getText());
		}
		
		WebElement secrowseccol=driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
		
		System.out.println("Printing second row second col data : " + secrowseccol.getText());
		
		driver.close();
	}

}
