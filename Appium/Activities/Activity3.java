package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Activity3 {
	AndroidDriver<MobileElement> driver;
	@BeforeClass
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "Pixel4Emulator");
	    caps.setCapability("platformName", "android");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("appPackage", "com.android.calculator2");
	    caps.setCapability("appActivity", ".Calculator");
	    caps.setCapability("noReset ", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, caps);
	  }
	
	@Test
	
	public void test1() {
			
		driver.findElementById("digit_5").click();
		driver.findElementByAccessibilityId("plus").click();
		driver.findElementById("digit_9").click();
		driver.findElementByAccessibilityId("equals").click();
		String res1=driver.findElementById("result").getText();
		System.out.println(res1);
		Assert.assertEquals(res1, "14");
				
  }
	@Test
	public void test2() {
		
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_sub").click();
		driver.findElementById("digit_5").click();
		driver.findElementByAccessibilityId("equals").click();
		String res2=driver.findElementById("result").getText();
		System.out.println(res2);
		Assert.assertEquals(res2, "5");
				
  }
@Test	
public void test3() {
		
		driver.findElementById("digit_5").click();
		driver.findElementById("op_mul").click();
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("digit_0").click();
		driver.findElementByAccessibilityId("equals").click();
		String res3=driver.findElementById("result").getText();
		System.out.println(res3);
		Assert.assertEquals(res3, "500");
				
  }
@Test
public void test4() {
	
	driver.findElementById("digit_5").click();
	driver.findElementById("digit_0").click();
	driver.findElementByAccessibilityId("divide").click();
	driver.findElementById("digit_2").click();
	
	driver.findElementByAccessibilityId("equals").click();
	String res4=driver.findElementById("result").getText();
	System.out.println(res4);
	Assert.assertEquals(res4, "25");
}
  
  
  @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
