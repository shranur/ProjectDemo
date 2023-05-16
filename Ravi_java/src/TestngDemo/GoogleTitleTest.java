package TestngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
	}
@Test
public void getTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google","title is not matching");
	
}
@Test
public void logoTest() {
	boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	Assert.assertTrue(b);
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
