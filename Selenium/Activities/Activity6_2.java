package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("Title of the page is "+ driver.getTitle());
		
		
		WebElement changecontentbtn=driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
		
		changecontentbtn.click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		WebElement content=driver.findElement(By.id("ajax-content"));
		System.out.println("The text is " + content.getText());
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
		
		System.out.println("The text is " + content.getText());

		Thread.sleep(3000);
		
		driver.close();
		
			}

}
