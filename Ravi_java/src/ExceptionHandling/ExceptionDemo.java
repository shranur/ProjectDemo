package ExceptionHandling;

import java.io.FileInputStream;

public class ExceptionDemo {

	public static void main(String[] args) {
		//FileInputStream fis=new FileInputStream("c:/abc.txt");   // there can be  exception in this which compiler can check. Multiple markers at this line
		//- Unhandled exception type FileNotFoundException
		//- Resource leak: 'fis' is never closed
		
	/*	// one example where compiler not able to check for exception
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
		// here compiler not able to check for exception so while run time throws exception
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		*/
		
	}

}
