package GeneralPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		
		// using algorithm
	/*	int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		*/
		
		// using stringbuffer class method
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();  */
		
		
		// using StringBuilder class method
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("Reverse Number is : "+rev);
		
	}

}
