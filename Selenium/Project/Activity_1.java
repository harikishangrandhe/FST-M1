package Project_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
    	//Open browser
    	driver = new ChromeDriver();
        
    }

    @Test
    public void MatchingSite() throws InterruptedException {
    	 driver.get("http://alchemy.hguy.co/orangehrm");
         driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 Assert.assertEquals("OrangeHRM",driver.getTitle());
		 Thread.sleep(5000);
		 
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}