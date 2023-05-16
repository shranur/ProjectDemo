package com.crm.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utilities.TestUtil;

public class TestBase {
	
	public static WebDriver driver; //global variables.
	public	static Properties prop;

	public TestBase() {  //constructor in which we are initializing the properties variable 
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\anura\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
					prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}
 public static void initialization() { // method in which we are initializing the web driver variable
	 String browsername=prop.getProperty("browser");
	 if(browsername.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.page_Load_Timeout_,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
	 }
 }
}
