package Activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	AndroidDriver<MobileElement> driver;
	WebDriver wait;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "Pixel4Emulator");
	    caps.setCapability("platformName", "android");
	    caps.setCapability("automationName", "UiAutomator2");
	    
	    caps.setCapability("appPackage", "com.android.chrome");
	    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	    caps.setCapability("noReset", true);
	    
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(remoteUrl, caps);
	    
	  }
	
	@Test
	public void test1()
	{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		
		   String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
	       System.out.println("Title on Homepage: " + pageTitle);
	       

	        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
	        aboutButton.click();
	        String newPageTitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]").getText();
	        System.out.println("Title on new page: " + newPageTitle);
	        Assert.assertEquals(pageTitle, "Training Support");
	        Assert.assertEquals(newPageTitle, "About Us");
	        	}
	
	  
  @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
