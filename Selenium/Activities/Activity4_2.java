package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("Title of the page is "+ driver.getTitle());
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement number=driver.findElement(By.xpath("//input[@id='number']"));
		WebElement msg=driver.findElement(By.xpath("//div/textarea"));
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		fname.sendKeys("Dharani");
		lname.sendKeys("Ramasamy");
		email.sendKeys("tell2Dharani@gmail.com");
		number.sendKeys("9487926666");
		msg.sendKeys("This is my activity 3 of selenium");
		Thread.sleep(3000);
		submit.submit();
		System.out.println("End of the pgm..");
		driver.close();
		

	}

}
