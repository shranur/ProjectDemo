package TestngDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
/*	@BeforeSuite
	public void setup() {
		System.out.println("setup system chrome property");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("enter url");
	}
	@BeforeTest
	public void login() {
		System.out.println("login method");
	}       */

	
	@Test
	public void logintest() {
		System.out.println("login done");
	}
@Test(dependsOnMethods="logintest")
public void homepage() {
	System.out.println("homepage done");
}
@Test(dependsOnMethods="logintest")
public void search() {
	System.out.println("search done");
}
@Test(dependsOnMethods="logintest")
public void logut() {
	System.out.println("logut done");
}

}
