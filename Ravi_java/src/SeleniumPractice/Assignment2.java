package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of the page :"+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL opf the page: "+url);
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().back();
		String googleurl=driver.getCurrentUrl();
		String expectedurl="https://www.google.com/";
		if(googleurl.equalsIgnoreCase(expectedurl)) {
			System.out.println("navigated to correct page");
		}
		else {
			System.out.println("incorrect page");
		}
		//Dimension D=new Dimension(200,400);
	//	driver.manage().window().setSize(D);
		
	//	Point P=new Point(100,200);
	//	driver.manage().window().setPosition(P);
		driver.navigate().forward();
		String fburl=driver.getCurrentUrl();
		String expectedfburl="https://www.facebook.com/";
				if(fburl.equals(expectedfburl)) {
					System.out.println("navigated to correct page");
				
				}
				else {
					System.out.println("navigated to incorrect page");
				}
				driver.navigate().refresh();
				driver.close();
				
		
	}

}
