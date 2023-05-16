package collections;

public class PrimeNumber {
	
	
	public void primeNum(int x)
	{
		for (int i =2 ; i<=x; i++)
		{
			if (x%i ==0 )
			{
				System.out.println("number is not prime");
				break;
			}
			else
			{
				System.out.println("Number is prime");
				break;
			}
		}	
	}
	
}

class Executor{
	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		pm.primeNum(101);
	}
}


