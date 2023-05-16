package GeneralPrograms;

public class SumOfElementsArray {

	public static void main(String[] args) {
		int[] a= {5,2,7,9,6}; 
		int sum=0;
		// first approach by using for loop
//		for(int i=0;i<a.length;i++) {
//			sum= sum+a[i];
//		}
//				System.out.println(sum);
		
		// second approach by using for each loop or enhanced for loop
		
		for(int e:a) {
			sum = sum+e;
		}
		System.out.println(sum);
	}

}
