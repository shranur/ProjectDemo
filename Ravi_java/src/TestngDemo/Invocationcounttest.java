package TestngDemo;

import org.testng.annotations.Test;

public class Invocationcounttest {
	@Test(invocationCount=10)
	public void sum() {
		int a=10,b=20,c=30;
		int d=a+b+c;
		System.out.println("sum is : "+d);

	}

}
