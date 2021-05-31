package Mobile_Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Google_Tasks {
    
	    AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
	    
	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel4_Emulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("applicationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);
	    }

	    @Test
	    public void Createtask() throws InterruptedException {
	    	
	    	String[] addtasks = {"Complete Activity with Google Tasks",
	    						"Complete Activity with Google Keep",
	    						"Complete the second Activity Google Keep"};
	    	
	    	for(String addtask : addtasks) {
	    	 wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task"))).click();
	    	 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title"))).sendKeys(addtask);
	    	 driver.findElementById("add_task_done").click();	    	 
	    	 
	    	}
	    	wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"),3));
	    	List<MobileElement> taskList = driver.findElementsById("task_name");
	    	
	    	System.out.println("Total Number of created tasks are :" + taskList.size());
	    	Assert.assertEquals(taskList.size(),3);
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    
	}
}
