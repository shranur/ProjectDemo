package com.guru99.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

import implementation.CommonDriver;
import pages.LoginPage;
import utils.ConfigUtils;
import utils.ReportUtils;
import utils.ScreenshotUtils;

public class BaseTest {
	
	CommonDriver cmnDriver;
	String url;
	WebDriver driver;
	LoginPage loginPage;
	String currentWorkingDirectory;
	String configFileName;
	Properties configProperty;
	
	
	ReportUtils reportUtils;
	String reportFilename;
	
	ScreenshotUtils screenshot;
	
	@BeforeSuite
	public void preSetup() throws IOException {
		currentWorkingDirectory = System.getenv("user.dir");
		configFileName = currentWorkingDirectory + "/config/config.properties";
		
		reportFilename = currentWorkingDirectory + "/report/guru99TestReport.html";
		
		configProperty = ConfigUtils.readPropreties(configFileName);
		reportUtils = new ReportUtils(reportFilename);
	}
	
	@BeforeClass
	public void setup() throws Exception {
		url = configProperty.getProperty("baseUrl");
		String browserType = configProperty.getProperty("browserType");
		cmnDriver = new CommonDriver("browserType");
		driver = cmnDriver.getDriver();
		loginPage = new LoginPage(driver);
		
		screenshot = new ScreenshotUtils(driver);
		cmnDriver.navigateToUrl(url);
	}
	
	@AfterMethod
	public void postTestAction(ITestResult result) throws Exception {
		
		String testCaseName = result.getName();
		long executionTime = System.currentTimeMillis();
		String screenshotFileName = currentWorkingDirectory + "/screenshots/" +testCaseName +executionTime+".jpeg";
		
		if(result.getStatus()== ITestResult.FAILURE) {
			reportUtils.addTestLog(Status.FAIL, "One or more steps failed");
			screenshot.captureAndSaveScreenshot(screenshotFileName);
		}
	}
	
	@AfterClass
	public void tearDown() {
		cmnDriver.closeAllBrowser();
		
	}
	
	@AfterSuite
	public void postTearDown() {
		reportUtils.flushReport();
	}

}
