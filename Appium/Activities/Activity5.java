package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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

public class Activity5 {
	AndroidDriver<MobileElement> driver;
	 WebDriverWait wait;
	
@BeforeClass
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "Pixel4Emulator");
	    caps.setCapability("platformName", "android");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("appPackage", "com.google.android.apps.messaging");
	    caps.setCapability("appActivity", ".ui.ConversationListActivity");
	    caps.setCapability("noReset ", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, caps);
	    wait=new WebDriverWait(driver,5);
	    	  }
	
	@Test
	public void sebdmsg() throws InterruptedException
	{
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		Thread.sleep(3000);
		
		driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("9482585581");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
		
		Thread.sleep(3000);
		

		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hello..Message from Appium");
		Thread.sleep(3000);
		
		driver.findElementById("send_message_button_icon").click();
		
		Thread.sleep(3000);

		String sentmsg=driver.findElementById("message_text").getText();
		System.out.println(sentmsg);

		Thread.sleep(3000);

		Assert.assertEquals(sentmsg, "Hello..Message from Appium");

			
		
	}
	
	
  
  @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
