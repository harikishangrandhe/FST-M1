package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-select']"));
		WebElement chosen=driver.findElement(By.id("single-value"));
		Select sel=new Select(dropdown);
		Thread.sleep(3000);
		sel.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		
		Thread.sleep(3000);
		sel.selectByIndex(3);
		System.out.println(chosen.getText());
		
		Thread.sleep(3000);
		sel.selectByValue("4");
		System.out.println(chosen.getText());
		Thread.sleep(3000);
				
		System.out.println("Printing all options of the drop down ");
		
		List<WebElement> allopt=sel.getOptions();
		for (WebElement a:allopt)
		{
			System.out.println(a.getText());
		}

		driver.close();
	}

}
