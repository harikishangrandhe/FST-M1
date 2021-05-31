package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of the page is " + driver.getTitle());
		WebElement e1=driver.findElement(By.id("about-link"));
		System.out.println("Printing text of the webelement using id :" + e1.getText());
		
		WebElement e2=driver.findElement(By.className("button"));
		System.out.println("Printing text of the webelement using className :" + e2.getText());
		
		
		WebElement e3=driver.findElement(By.linkText("About Us"));
		System.out.println("Printing text of the webelement using linkText :" + e3.getText());
		
		WebElement e4=driver.findElement(By.cssSelector("a#about-link"));
		System.out.println("Printing text of the webelement using cssSelector :" + e4.getText());
							
		Thread.sleep(1000);
		driver.close();

	}

}
