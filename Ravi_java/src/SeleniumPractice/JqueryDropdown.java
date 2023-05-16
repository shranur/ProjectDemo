package SeleniumPractice;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
//		selectChoicevalue(driver, "choice1");
//		selectChoicevalue(driver, "choice1"."choice2","choice2 1");
//		selectChoicevalue(driver, "all");
			
	}
	public static void selectChoicevalue(WebDriver driver, String...value) {
		
	}

}
