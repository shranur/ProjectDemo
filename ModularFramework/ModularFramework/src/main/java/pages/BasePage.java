package pages;

import org.openqa.selenium.WebDriver;

import implementation.ElementControl;

public class BasePage {
	
	WebDriver driver;
	
	public ElementControl elementControl;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		elementControl = new ElementControl(driver);
	}

}
