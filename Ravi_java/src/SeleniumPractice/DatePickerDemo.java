package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://redbus.in/");
		driver.manage().window().maximize();
		
		String year =  "2022";
		String month = "jun";
		String date = "2";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		
		
		while(true) {
		String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		String[] arr = monthyear.split(" ");
		String mon = arr[0];
		String yr = arr[1];
		System.out.println(mon);
		System.out.println(yr);
		
		if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) 
			break;
		
		else 
			driver.findElement(By.xpath("//td[@class='next']/button")).click();
		
		}
		
	}

}
