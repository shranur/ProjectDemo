package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessTestingDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://redtape.com/");
		
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("brown belt");
	//	driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("brown belt");
	}

}
