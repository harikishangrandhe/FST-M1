package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is "+ driver.getTitle());
				
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement removecheckboxbtn=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		System.out.println("Is the checkbox visible on the page? " + checkbox.isDisplayed());
		
		Thread.sleep(3000);
		removecheckboxbtn.click();
		System.out.println("Remove checkbox button is clicked successfully");
		Thread.sleep(3000);
		System.out.println("Is the checkbox visible on the page? " + checkbox.isDisplayed());
		
		driver.close();
		
		

	}

}
