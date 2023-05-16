package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anura\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/deal/d7f24f67?showVariations=true&ref=dlx_13894_sh_dcl_img_0_d7f24f67_dt_mese6_b2");
		driver.manage().window().maximize();
		
		List<WebElement> mobileprice=driver.findElements(By.xpath("//li/span[1]/div[1]/div[2]/div[4]/span[1]/span[2]/span[2]"));
		System.out.println(mobileprice.size());
		
		
	}

}
