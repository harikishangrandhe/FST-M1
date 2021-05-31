package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("Title of the page is "+ driver.getTitle());
				
		WebElement h3=driver.findElement(By.xpath("//h3[@id='third-header']"));
		WebElement h5=driver.findElement(By.xpath("//h5[contains(class,green)]"));
		WebElement violet=driver.findElement(By.xpath("//div/button[contains(text(),'Violet')]"));
		WebElement grey=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]"));
		
		
		System.out.println("The third header -text is " + h3.getText());
		System.out.println("The fifth header -text is " + h5.getText());
		System.out.println("Header 5 css color value is " + h5.getCssValue("color"));
		System.out.println("The class attribute values of violet button are  "+ violet.getAttribute("class"));
		System.out.println("The grey button text is "+ grey.getText());
		System.out.println("End of the program");
		
		driver.close();
		
		

	}

}
