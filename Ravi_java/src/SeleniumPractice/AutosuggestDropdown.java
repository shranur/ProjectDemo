package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java tutorial");
		Thread.sleep(3000);
		List<WebElement>autosuggestion=driver.findElements(By.xpath("//li[@class='sbct']/div/div[2]/div[1]/span"));
		
		System.out.println(autosuggestion.size());

		
		for(WebElement i:autosuggestion) {
			if(i.getText().contains("for beginners")) {
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
