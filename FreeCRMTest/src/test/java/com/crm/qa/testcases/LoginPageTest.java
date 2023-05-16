package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseclass.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ProfilePage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	ProfilePage profilePage;
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.validatePageTitle();
		Assert.assertEquals(title, "ToolsQA", "Title not matched");
	}
	
	@Test(priority=2)
	public void loginPageLogoTest() {
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		profilePage=loginPage.login(prop.getProperty("username"), "password");
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
