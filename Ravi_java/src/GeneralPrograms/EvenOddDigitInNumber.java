package GeneralPrograms;

public class EvenOddDigitInNumber {

	public static void main(String[] args) {
		int no= 4567834;
		int even_count=0;
		int odd_count=0;
		while(no>0) {
			int reminder= no%10;
			if(reminder%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			no=no/10;
			
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	}

}
