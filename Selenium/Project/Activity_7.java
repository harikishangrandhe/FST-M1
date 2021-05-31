package Project_HRM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_7 {
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Directory() throws InterruptedException {
    	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    	driver.findElement(By.linkText("Qualifications")).click();
    	driver.findElement(By.id("addWorkExperience")).click();
    	driver.findElement(By.id("experience_employer")).sendKeys("IBM");
    	driver.findElement(By.id("experience_jobtitle")).sendKeys("Automation Tester");
    	driver.findElement(By.id("btnWorkExpSave")).submit();
    	Thread.sleep(5000);
    	
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}