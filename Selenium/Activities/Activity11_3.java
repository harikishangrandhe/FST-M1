package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
	               
	        driver.get("https://www.training-support.net/selenium/javascript-alerts");
	        System.out.println("Title of the page " + driver.getTitle());
	        
	        WebElement alert = driver.findElement(By.id("prompt"));
	        Thread.sleep(3000);
	        alert.click();
	        Thread.sleep(3000);
	        Alert alt=driver.switchTo().alert();
	        Thread.sleep(3000);
	        String msg1=alt.getText();
	        System.out.println("The alert msg is : " + msg1);
	        String msg="Yes!!! You are...";
	        alt.sendKeys(msg);
	        Thread.sleep(3000);
	        alt.accept();
	        Thread.sleep(3000);
	        driver.close();
	}

}
