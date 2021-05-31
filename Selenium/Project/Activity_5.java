package Project_HRM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_5 {
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
    public void MyInfo() throws InterruptedException {
    	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    	driver.findElement(By.id("btnSave")).click();
    	driver.findElement(By.id("personal_txtEmpFirstName")).clear();
    	driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Hari");
    	driver.findElement(By.id("personal_txtEmpLastName")).clear();
    	driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("kishan");
    	driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).click();
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Select dropdown = new Select(driver.findElement(By.id("personal_cmbNation")));
    	dropdown.selectByValue("82");
    	driver.findElement(By.id("btnSave")).click();
    	
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}