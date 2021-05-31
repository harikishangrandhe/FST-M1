package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
	               
	        driver.get("https://www.training-support.net/selenium/javascript-alerts");
	        System.out.println("Title of the page " + driver.getTitle());
	        
	        
	        WebElement simpleAlert = driver.findElement(By.id("simple"));
	        Thread.sleep(3000);
	        simpleAlert.click();
	        Thread.sleep(3000);
	        Alert alt=driver.switchTo().alert();
	        Thread.sleep(3000);
	        String msg=alt.getText();
	        System.out.println("The alert msg is : " + msg);
	        alt.accept();
	        Thread.sleep(3000);
	        driver.close();
	}

}
