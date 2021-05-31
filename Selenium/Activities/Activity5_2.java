package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is "+ driver.getTitle());
				
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		//WebElement removecheckboxbtn=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		System.out.println("Is the checkbox selected ? " + checkbox.isSelected());
		
		Thread.sleep(3000);
		checkbox.click();
		System.out.println("Checkbox click is successful");
		Thread.sleep(3000);
		System.out.println("Is the checkbox selected? " + checkbox.isSelected());
		
		driver.close();
		
		

	}

}
