package com.sample;

public class KthElement {

	public static void findKthElement(String elements, String k) {

		char[] ch = elements.toCharArray();

		int len = ch.length;
		System.out.println(len);

		for (int i = 0; i < len; i++) {

			if (elements.contains(k)) {

				System.out.println("Element present at kth Location in given array :" + " " + k);
				int kthElement = elements.indexOf(k);

				System.out.println("Index of Kth element in given array :" + " " + kthElement);
				break;
			}

			else {
				System.out.println("Element in not present in given array");
				break;

			}
		}
	}

	public static void findElementWhile(String ele, String l) {

		char[] ch = ele.toCharArray();
		char[] ch1 = l.toCharArray();

		int len = ch.length;
		int len1 = ch1.length;
		System.out.println(len);

		for (int i = 0; i < len && i < len1; i++) {
			if (ele.charAt(i) == l.charAt(i)) {
				System.out.println("Element in present in given array at O index location");
				System.out.println("target achieved!!!");
				System.out.println(l);
			}
			else {
				System.out.println("Element not present in given Array!");
			}
		}

	}

	public static void main(String[] args) {
		findNumber("abcd", "a");
		
		// findElementWhile("7321", "7");

	}
// Optimised Solution  AT
	public static boolean findNumber(String value, String a) {
		boolean flag = false;
		if (value.contains(a)) {

			String str = String.valueOf(value.charAt(0));
			System.out.println(str);
			if (str.equals(a)) {
				System.out.println("yes");
				flag = true;
				
			} else {
				System.out.println("no");
				flag = false;
			}
		} else {
			System.out.println("element is not present");
		}
		return flag;
	}
	
}
