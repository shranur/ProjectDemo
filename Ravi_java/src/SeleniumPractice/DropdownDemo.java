package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.xpath("//select[@id='input-country']"));
		DropdownGenericDemo.selectDRPValue(drp , "Aruba");
	// selectDRPValue("//select[@id='input-country']","Aruba"):
		
//		WebElement drpdwn=driver.findElement(By.xpath());
//		Select drpcountry= new Select(drpdwn);
//		//drpcountry.selectByVisibleText("Andorra");
//		//drpcountry.selectByValue("4");
//		//drpcountry.selectByIndex(13);
//		
//		// selecting option from dropdown without using select class method
//		List<WebElement> alloptions= drpcountry.getOptions();
//		for(WebElement i:alloptions) {
//			if(i.getText().equals("Aruba")) {
//				i.click();
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
	}

}
