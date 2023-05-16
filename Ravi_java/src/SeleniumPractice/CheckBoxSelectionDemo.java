package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		// selecting a specific checkbox
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
//		Thread.sleep(2000);
//	
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
		//selecting all the checkboxes
//		  List<WebElement>drpdownoptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//		  
//		  for(WebElement d:drpdownoptions) {
//			  d.click();
//		  }
		
		// selecting any specific checkbox monday and wednesday
		
		
		  
		  
		  List<WebElement>drpdownoptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		  
		  for(WebElement dp:drpdownoptions) {
			  String checkboxname=dp.getAttribute("id");
			  if(checkboxname.equals("monday" )||checkboxname.equals("wednesday")) {
				  dp.click();
				  
			  }
			  
		  }
		  Thread.sleep(2000);

	}

}
