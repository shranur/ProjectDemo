package com.cg.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomatiomDemo {
	
	WebDriver driver;
	
	public AutomatiomDemo() {
		
		System.setProperty("webdriver.chrome.driver", "driver//chromdriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	public void loadUrl(){
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("enterimg")).click();
	}
	
	void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	

}
