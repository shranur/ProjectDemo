package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	/*	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
		// right click action
		Actions act= new  Actions(driver);
		
		act.contextClick(button).perform();  // perform method already include build method// build method will build the action and perform will perform it
		*/
		
		// double click action
		
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button2 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act1 = new Actions(driver);
		
		act1.doubleClick(button2).perform();
		
		driver.switchTo().alert().accept();
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
