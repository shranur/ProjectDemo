package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[type=email]")).sendKeys("+919754514548");
		driver.findElement(By.cssSelector("input[id=continue]")).click();
		driver.findElement(By.cssSelector("[type=password]")).sendKeys("tomar83740");
		driver.findElement(By.cssSelector("input[id=signInSubmit]")).click();
		System.out.println("title of web page is "+driver.getTitle());
		System.out.println("url of web page is "+driver.getCurrentUrl());
		int[] x = new int[5];
		System.out.println(x[5]);
	}

}
