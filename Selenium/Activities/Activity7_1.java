package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page is "+ driver.getTitle());
		
		WebElement username=driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		
		WebElement loginMsg=driver.findElement(By.id("action-confirmation"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		loginBtn.click();
			
		wait.until(ExpectedConditions.textToBePresentInElement(loginMsg, "Welcome"));
		//wait.until(ExpectedConditions.textToBePresentInElement(loginMsg, "Welcome Back, admin"));
		System.out.println("Login message is " + loginMsg.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
			}

}
