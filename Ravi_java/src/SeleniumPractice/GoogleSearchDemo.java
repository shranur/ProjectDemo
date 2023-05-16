package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		Thread.sleep(3000);
		
		List<WebElement> search_options = driver.findElements(By.xpath("//ul[@class='aajZCb']//li/div[2]/div[1]/span"));
		
		System.out.println(search_options.size());
		
		for(WebElement e: search_options) {
			if(e.getText().contains("tools")) {
				e.click();
				break;
			}
			
		}
		
	}

}
