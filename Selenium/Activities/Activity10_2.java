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

public class Activity10_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
	        Actions actions = new Actions(driver);
	               
	        driver.get("https://www.training-support.net/selenium/input-events");
	        WebElement keypressed = driver.findElement(By.id("keyPressed"));
	        System.out.println("Title of page is " + driver.getTitle());
	        actions.sendKeys("D").build().perform();
	        System.out.println("The key pressed by you is " +keypressed.getText() );
	        actions.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	        
       
	        Thread.sleep(3000);

	        //Close browser
	        driver.close();
	}

}
