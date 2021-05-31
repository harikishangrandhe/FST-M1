package Project_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity_2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        
    	driver = new ChromeDriver();        
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
    }

    @Test
    public void GetUrl() throws InterruptedException {
    			
		//WebElement link =driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		WebElement link =driver.findElement(By.xpath("//*[@id='divLogo']/img"));
		System.out.println(link.getAttribute("src"));
		Thread.sleep(5000);
		
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}