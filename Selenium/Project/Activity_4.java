package Project_HRM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_4 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(5000);
    }

    @Test
    public void Pim() throws InterruptedException {
    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
    	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();    	
    	Actions act=new Actions(driver);
    	act.clickAndHold(driver.findElement(By.id("btnAdd"))).release().perform();
    	Thread.sleep(5000);
    	driver.findElement(By.id("firstName")).sendKeys("Hari");
    	Thread.sleep(2000);
    	driver.findElement(By.id("lastName")).sendKeys("Kishan");
    	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    	Thread.sleep(5000);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}