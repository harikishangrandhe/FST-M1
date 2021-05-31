package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of the current page is " + driver.getTitle());
		WebElement aboutus=driver.findElement(By.xpath("//a[@id='about-link']"));
		aboutus.click();
		System.out.println("Titlt of the new page is " + driver.getTitle());
		driver.close();
	}

}
