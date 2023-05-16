package GeneralPrograms;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,};
		int[] a2= {1,2,3,4,5};
		
		// first approach by inbuilt method
		
		/*boolean b=Arrays.equals(a1, a2);
		if(b==true) {
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}*/
		
		
		
		// second approach by using logic
		// first we will check the length of both array and one boolean status true we will take
		boolean status = true;
		if(a1.length==a2.length) {
			
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status = false;
				}
			}
		}
		else {
			status= false;
		}
		
		if(status==false) {
			System.out.println("Arrays are not equal");
		}
		else
			System.out.println("Arrays are equal");
	}

}
