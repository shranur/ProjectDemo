package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownGenericDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		 
	}
	public static void selectDRPValue(WebElement ele,String value) {
		Select drpcountry=new Select(ele);
		List<WebElement>alloption=drpcountry.getOptions();
		
		for(WebElement i:alloption) {
			if(i.getText().equals(value)) {
				i.click();
				break;
				
			}
		}
		
	}
	

}
