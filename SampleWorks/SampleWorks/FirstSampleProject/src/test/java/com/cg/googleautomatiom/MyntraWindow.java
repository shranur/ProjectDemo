package com.cg.googleautomatiom;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWindow {
	
	
WebDriver driver;
	
	public MyntraWindow() {
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	void loadUrl() {
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
	
	public void title() {
		
		System.out.println(driver.getTitle());
	}
	
	public void newTab() {
		
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
//		WebElement ele1 =driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]"));
//
//		WebElement ele2 =driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
//
//		WebElement ele3 =driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));

		ele.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
//		ele1.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
//
//		ele2.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
//
//		ele3.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

	}
	
	public void switchTab() {
		
	ArrayList<String> as = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(as.get(1));

	
	
	}
	
	public void openTab(String xpath) 
	{
		WebElement ele = driver.findElement(By.xpath(xpath));
		ele.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	public void switchTabGeneric() throws InterruptedException
	{
		ArrayList<String> as = new ArrayList<>(driver.getWindowHandles());
		for (int i = 0; i < as.size(); i++) {
			
			driver.switchTo().window(as.get(i));
			System.out.println(driver.getTitle());
			Thread.sleep(4000);
			
		}
		
	}
	

}
