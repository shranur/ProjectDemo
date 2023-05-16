package SeleniumPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//li[@id='menu-sale']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse26']/li[1]/a")).click();
		
		
		// finding total no of pages by text
		String totalPage=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(totalPage);
		int firstIndex= totalPage.indexOf("(");
		int lastIndex = totalPage.indexOf("P");
		
		String noOfPages = totalPage.substring(firstIndex+1, lastIndex-1);
		
		int totalPages = Integer.valueOf(noOfPages);
		
		System.out.println(totalPages);
		for(int p=1;p<=totalPages;p++) {
			
			
		}
	}

}
