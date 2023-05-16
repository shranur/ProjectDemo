package com.guru99.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTest extends BaseTest {
	
	@Parameters({"username", "paswword"})
	@Test
	public void verufyuserLoginWithCorrectCredentials(String username, String password) {
		reportUtils.createTestCase("verufyuserLoginWithCorrectCredentials");
		reportUtils.addTestLog(Status.INFO, "Performing login");
		
		loginPage.loginToApplication(username, password);
		String expectedTitle ="Guru 99 Bank Manager HomePage";
		String actualTitle = cmnDriver.getTitle();
		
		reportUtils.addTestLog(Status.INFO, "comparing expected and actual title");
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
