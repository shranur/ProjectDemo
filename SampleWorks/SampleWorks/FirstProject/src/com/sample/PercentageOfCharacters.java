package com.sample;

import java.text.DecimalFormat;

public class PercentageOfCharacters {
	
	
	public static void charPercentage (String str) {
		
		int len = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitsCount = 0;
		int specialCharCount = 0;
		
		for (int i=0 ; i<len;i++)
		{
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch))
			{
				upperCaseCount++;
			}
			else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			else if (Character.isDigit(ch)) {
				digitsCount++;
			}
			else {
				specialCharCount++;
			}
			
		}
		
		double upperCasePercent = (upperCaseCount*100.0)/len;
		double lowerCasePercent = (lowerCaseCount*100.0)/len;
		double digitsPercent = (digitsCount*100.0)/len;
		double spCharPercent = (specialCharCount*100.0)/len;
		
		System.out.println("In the given str:"  + " " + str);
		// to get the result in 2 digits after decimal
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		System.out.println("Upper Case letter percent is " + df.format(upperCasePercent));
		System.out.println("Lower Case letter percent is " +df.format(lowerCasePercent));
		System.out.println("Digits percent is " +df.format(digitsPercent));
		System.out.println("Special Character percent is " +df.format(specialCharCount));
		
		System.out.println("Total Percentage Sum:" + " " + (upperCasePercent+lowerCasePercent+digitsPercent+spCharPercent));
	}

	public static void main(String[] args) {
		
		charPercentage("anurag ShrivasTava Is 23/09/1993 @#");

	}

}
