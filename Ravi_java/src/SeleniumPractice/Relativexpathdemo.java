package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		
		//Xpath Axes demo
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//using absolute xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//String companyname=driver.findElement(By.xpath("//a[contains(text(),'Kirloskar Ferrou')]")).getText();
		//System.out.println(companyname+" : ");
		
		//List<WebElement> childelement=driver.findElements(By.xpath("//a[contains(text(),'Kirloskar Ferrou')]/ancestor::tr/child::td"));
		//System.out.println(childelement.size());
		String text=driver.findElement(By.xpath("//a[contains(text(),'Kirloskar Ferrou')]/ancestor::tr")).getText();
		System.out.println(text);
		driver.close();
	}

}
