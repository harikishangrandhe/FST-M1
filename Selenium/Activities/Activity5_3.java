package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is "+ driver.getTitle());
				
		//WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		//WebElement removecheckboxbtn=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		WebElement textfield=driver.findElement(By.xpath("//input[@id='input-text']"));
		
		System.out.println("Is the textbox enabled ? " + textfield.isEnabled());
		WebElement enableinput=driver.findElement(By.xpath("//button[@id='toggleInput']"));
		
		enableinput.click();
		
		System.out.println("Enable textbox button is clicked successfully");

		System.out.println("Is the textbox enabled ? " + textfield.isEnabled());
		
		Thread.sleep(3000);
		
		driver.close();
		
			}

}
