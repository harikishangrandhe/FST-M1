package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
	        Actions actions = new Actions(driver);
	        WebElement cubeVal;
	       
	        driver.get("https://www.training-support.net/selenium/input-events");
	        WebElement cube = driver.findElement(By.id("D3Cube"));
	        
	        //Left click
	        actions.click(cube);
	        //actions.click(cube).build().perform();
	        cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Left Click: " + cubeVal.getText());
	        Thread.sleep(3000);

	        //Double click
	        
	        //actions.doubleClick(cube).build().perform();
	        actions.doubleClick(cube).perform();
	        cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Double Click: " + cubeVal.getText());
	        Thread.sleep(3000);
	        
	        //Right click        
	        //actions.contextClick(cube).build().perform();
	        actions.contextClick(cube).perform();
	        cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Right Click: " + cubeVal.getText());
	        Thread.sleep(3000);

	        //Close browser
	        driver.close();
	}

}
