package Project_HRM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_6 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(5000);
    }

    @Test
    public void Directory() throws InterruptedException {
    	boolean check = driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
    	Assert.assertEquals(true,check);
    	driver.findElement(By.id("menu_directory_viewDirectory")).click();
    	String dir=driver.findElement(By.xpath("//h1[text()='Search Directory']")).getText();
    	Assert.assertEquals("Search Directory",dir);
    	System.out.println(dir);
    	
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}