package GeneralPrograms;

public class PrintEvenOddFromArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		System.out.println("even no are: ");
		for(int no:a) {
			
			if(no%2==0) {
				System.out.print(no);
			}
		System.out.println("odd no are");
			for(int value:a) {
				if(value%2!=0) {
					System.out.print(value);
				}
			}
				
			}
			
				
			
		
	}

}
