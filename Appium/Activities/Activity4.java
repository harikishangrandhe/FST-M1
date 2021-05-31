package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	AndroidDriver<MobileElement> driver;
	 WebDriverWait wait;
	
@BeforeClass
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "Pixel4Emulator");
	    caps.setCapability("platformName", "android");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("appPackage", "com.android.contacts");
	    caps.setCapability("appActivity", ".activities.PeopleActivity");
	    caps.setCapability("noReset ", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, caps);
	    wait=new WebDriverWait(driver,5);
	    	  }
	
	@Test
	public void addcontact() throws InterruptedException
	{
		driver.findElementById("floating_action_button_container").click();
		Thread.sleep(3000);
		
			
		driver.findElementByXPath("//android.widget.LinearLayout/android.widget.EditText[1]").sendKeys("Aaditya");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.LinearLayout/android.widget.EditText[2]").sendKeys("Varma");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("1212121211");
		Thread.sleep(3000);
		driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
		
		String contactname=driver.findElementById("com.android.contacts:id/large_title").getText();
		Thread.sleep(3000);
		
		Assert.assertEquals("Aaditya Varma", contactname);
		
	}
	
	
  
  @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
