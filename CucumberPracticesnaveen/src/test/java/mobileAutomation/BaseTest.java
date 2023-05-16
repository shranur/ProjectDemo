package mobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseTest {
	
	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 * File f = new File("/CucumberPracticesnaveen/src/test/java/"); File fs = new
		 * File(f,"Photos.apk");
		 */
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//cap.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability("appPackage", "com.google.android.calendar");
		cap.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.get("www.amazon.com");
		
	}

}
