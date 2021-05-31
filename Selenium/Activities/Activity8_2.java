package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[1]/td"));
		
		System.out.println("No.of rows : " + rows.size());
		System.out.println("No.of cols : " + cols.size());
					
				
		WebElement secrowseccol=driver.findElement(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[2]/td[2]"));
		
		System.out.println("Printing second row second col data : " + secrowseccol.getText());
		Thread.sleep(3000);
		WebElement firstcolheader=driver.findElement(By.xpath("//table[contains(@class,'sortable')]/thead/tr/th[1]"));
		
		firstcolheader.click();
		Thread.sleep(3000);
		WebElement secrowseccol1=driver.findElement(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[2]/td[2]"));
		System.out.println("Printing second row second col data : " + secrowseccol1.getText());
		
//		List<WebElement> footerdata=driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tfoot/tr/th"));
//		System.out.println("Printing the cell values of the table footer : ");
//		for (WebElement e: footerdata)
//		{
//			System.out.println("Foorter Cell value : " + e.getText());
//		}
		
		WebElement footerdata=driver.findElement(By.xpath("//table[contains(@class,'sortable')]/tfoot/tr"));
		System.out.println("Footer row is "+ footerdata.getText());
		driver.close();

	}

}
