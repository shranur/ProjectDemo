package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\anura\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(null);
	}

}
