package GeneralPrograms;

import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second number");
		int b=s.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("swapped no is :"+a+" and"+b);
		
	}
		
		

}
