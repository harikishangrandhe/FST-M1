package Activities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
		    WebDriverWait wait = new WebDriverWait(driver, 5);
	               
	        driver.get("https://www.training-support.net/selenium/tab-opener");
	        System.out.println("Title of the page " + driver.getTitle());
	        String parentwindow=driver.getWindowHandle();
	        System.out.println("Parent window handle is " + parentwindow );
	           
	        WebElement newTabBtn = driver.findElement(By.id("launcher"));
	        Thread.sleep(3000);
	        newTabBtn.click();
	        	        
	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	        
	        //wait for the tab to open
	        
	        Set<String> allwinhandles=driver.getWindowHandles();
	        System.out.println("all window handles are " + allwinhandles);
	        
	        
	        for (String hndl :allwinhandles)
	        {
	        	Thread.sleep(3000);
	        	driver.switchTo().window(hndl);
	        	Thread.sleep(3000);
	        	System.out.println("the window handle is " + hndl);
	        }
	        
	        
	        driver.quit();
	}

}
