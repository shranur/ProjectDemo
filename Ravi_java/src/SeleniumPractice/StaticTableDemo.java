package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		// how many rows in table
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rows);
		
		// how many colums in table
		int columns = driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		System.out.println(columns);
		
		
		// retrieve the specific row/column data      
		String value = driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[1]")).getText();
		System.out.println(value);
		
		
		// retrieve all the data from the table
		System.out.println("data from the table");
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"    ");
			}
			System.out.println();
		}
		
		
		
		// print contact and country of adobe
		for(int i=2;i<=rows;i++) {
			String specific_value = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td[1]")).getText();
			if(specific_value.equals("Adobe")) {
				String contact = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td[2]")).getText();
				String country = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td[3]")).getText();
				System.out.println("Data from the country  "+specific_value+"  "+contact+"   "+country);
			}
		}
		driver.close();
	}
}
