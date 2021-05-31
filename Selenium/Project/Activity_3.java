package Project_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        
    	driver = new ChromeDriver();        
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
    }

    @Test
    public void Login() throws InterruptedException {
    	 
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).submit();
		 Thread.sleep(5000);
		 
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}