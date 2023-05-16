package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseclass.TestBase;

public class LoginPage extends TestBase {
	//here we are defining all the web elements called as pagefactory which is a class
	
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginbutton;
	
	@FindBy(id="newUser")
	WebElement newuserbutton;
	
	@FindBy(xpath="//img[@src='/images/Toolsqa.jpg']")
	WebElement toolsqalogo;
	
	// now we are initializing the elements/page objects by constructor and page factory class
	
	public LoginPage() {
		PageFactory.initElements(driver, this); // this is how we initialize our pagefactory.   initElements(SearchContext, Class(class name.class or this keyword))
	}
	
// now we create method for actions on the elements these methods will return something
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return toolsqalogo.isDisplayed();
		
	}
	
	public ProfilePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbutton);
		//loginbutton.click();
		
		return new ProfilePage();
	}
	
}
