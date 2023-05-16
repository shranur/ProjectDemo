package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sdetvideo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
	WebElement searchstore=	driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	//isDisplayed and isEnabled methods
	
		System.out.println("Display Status : "+searchstore.isDisplayed());
		//boolean b=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
		System.out.println("Enable Status : "+searchstore.isEnabled());
		
		
		// isSelected ,ethod used to check whether any element is selcted or not. like radio button, checkboxes, dropdown
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Male button status: "+male.isSelected());
		System.out.println("Female button status : "+female.isSelected());
		
		// now selecting male radio button
		male.click();
		System.out.println("male button status: "+male.isSelected());
		System.out.println("Female button status : "+female.isSelected());
		
		// now selecting female radio button
		female.click();
		System.out.println("male button status: "+male.isSelected());
		System.out.println("Female button status : "+female.isSelected());
		
		
		
	}

}
