package Project_HRM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_41 {
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
    public void GetUrl() throws InterruptedException {
    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
    	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Hari Kishan");
    	driver.findElement(By.id("searchBtn")).click();
    	boolean name=driver.findElement(By.xpath("//a[text()='Hari']")).isDisplayed();
    	System.out.println(name);
    	Assert.assertEquals(true,name);
    	
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}