package SeleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//getWindowHandle()
//		String windoID= driver.getWindowHandle();
//		System.out.println(windoID);  //  A7E469FAD885C5C5E428679269C70108   //   8017F49AACF5BE2EAB5534AD3213B4AD
		
		
		//getWindowHandles()
		
		//first method
		
		driver.findElement(By.xpath("//a[text()='nopCommerce']")).click();  // it will open the new window
		
		Set<String> windowID=driver.getWindowHandles(); // return id of multiple browser window in the form of Set
		
		Iterator<String> it= windowID.iterator();
		
		String parentwindowID=it.next();
		String childwindowID=it.next();
		
		System.out.println("parent window id: "+parentwindowID);
		System.out.println("child window id: "+childwindowID);  

		
		// second method
		
//		List<String> windowIDList= new ArrayList(windowID);
//		
//		String parentWindowID=windowIDList.get(0);
//		String childWindowID=windowIDList.get(1);
//		
		
		
		
		// how to use window id for switching window
		
		driver.switchTo().window(childwindowID);
		
		System.out.println("child window title"+driver.getTitle());
		
		driver.switchTo().window(parentwindowID);
		System.out.println("parent window title"+driver.getTitle());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
