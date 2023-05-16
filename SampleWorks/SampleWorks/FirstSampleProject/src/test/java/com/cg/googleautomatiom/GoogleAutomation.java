package com.cg.googleautomatiom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	
	WebDriver driver;
	
	public GoogleAutomation() {
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	void loadUrl() {
		driver.get("https://www.google.co.in/");
	}
	
	public void searchText() {
		
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Capgemini India");
	search.click();
	 
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void getTitle() {
		
		driver.getTitle();
	}
	
	public void getImages() {
		
		WebElement image = driver.findElement(By.linkText("Images"));
		image.click();
	}
	
	public void getLinks() {
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (WebElement link : links) {
			
			System.out.println(link.getText());
			
		}
		
	}
	
	void close()
	{
		driver.close();
	}

}
