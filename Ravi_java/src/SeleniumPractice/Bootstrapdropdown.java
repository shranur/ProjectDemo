package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Select Product Type']")).click();
		
		List<WebElement> producttype= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		for(WebElement pt:producttype) {
			if(pt.getText().equals("Accounts")) {
				pt.click();
				break;
			}
		}
		
		
		
		
		
	}

}
