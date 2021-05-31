package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page is "+ driver.getTitle());
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		WebElement password=driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		
		//WebElement confirmpwd=driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		WebElement confirmpwd=driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		
		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
		
		WebElement msg=driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		
		username.sendKeys("abc");
		password.sendKeys("123");
		confirmpwd.sendKeys("123");
		email.sendKeys("abc123@gmail.com");
		Thread.sleep(3000);
		
		signup.click();
			
		wait.until(ExpectedConditions.textToBePresentInElement(msg, "Thank"));
		//wait.until(ExpectedConditions.textToBePresentInElement(loginMsg, "Welcome Back, admin"));
		System.out.println("The message after sign up process is " + msg.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
			}

}
