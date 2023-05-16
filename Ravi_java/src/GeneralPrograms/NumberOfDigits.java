package GeneralPrograms;

public class NumberOfDigits {

	public static void main(String[] args) {
		int no= 123456;
		int count=0;
		while(no> 0) {
			no= no/10;
			count++;
		}
		System.out.println(count);
	}

}
