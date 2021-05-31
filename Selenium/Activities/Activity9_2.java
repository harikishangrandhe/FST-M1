package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='multi-select']"));
		WebElement chosen=driver.findElement(By.xpath("//h3[@id='multi-value']"));
		Select sel=new Select(dropdown);
		Thread.sleep(3000);
		System.out.println("is the dropdown is multi select ? " + sel.isMultiple());
		
		if (sel.isMultiple())
		{
		sel.selectByVisibleText("Javascript");
		System.out.println(chosen.getText());
		Thread.sleep(3000);
		sel.selectByValue("node");
		System.out.println(chosen.getText());
		Thread.sleep(3000);
		
		sel.selectByIndex(4);
		System.out.println(chosen.getText());
		sel.selectByIndex(5);
		System.out.println(chosen.getText());
		sel.selectByIndex(6);
		System.out.println(chosen.getText());
		
		sel.deselectByValue("node");
		System.out.println(chosen.getText());
		Thread.sleep(3000);
		
		sel.deselectByIndex(7);
		Thread.sleep(3000);
		System.out.println(chosen.getText());
		
		String str=sel.getFirstSelectedOption().getText();
		System.out.println("Printing the first selected options : " + str);
		
		List<WebElement> allopt=sel.getAllSelectedOptions();
		for (WebElement a:allopt)
		{
			System.out.println(a.getText());
		}
		
		Thread.sleep(3000);
		sel.deselectAll();
		System.out.println(chosen.getText());
		
		Thread.sleep(3000);
		driver.close();
	}
	}
	}
