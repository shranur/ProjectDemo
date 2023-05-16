package InterfaceNaveen;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal); // 
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.mutualFund();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymorphism
		// child class object can be referred by parent interface reference var.
		USBank u=new HSBCBank();
		u.credit();
		u.debit();
		u.transfermoney();
		BrazilBank b=new HSBCBank();
		b.mutualFund();
		
		
	}
	

}
