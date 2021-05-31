package Activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
	        Actions actions = new Actions(driver);
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	               
	        driver.get("https://training-support.net/selenium/drag-drop");
	        System.out.println("Title of page is " + driver.getTitle());
	        
	        WebElement Ball = driver.findElement(By.id("draggable"));
	        WebElement dropzone1=driver.findElement(By.xpath("//div[@id='droppable']"));
	        WebElement dropzone2=driver.findElement(By.xpath("//div[@id='dropzone2']"));
	        	        
	        Thread.sleep(3000);
	        actions.dragAndDrop(Ball, dropzone1).build().perform();
	        Thread.sleep(3000);
	        
	        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"));
	        System.out.println(" Ball dropped to zone 1 successfully");
	        Thread.sleep(3000);
	        
	        actions.dragAndDrop(Ball, dropzone2).build().perform();
	        Thread.sleep(3000);
	        
	        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background-color"));
	        System.out.println(" Ball dropped to zone 2 successfully");
	        Thread.sleep(3000);
	          
	        driver.close();
	}

}
