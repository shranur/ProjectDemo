package InterfaceNaveen;

public class HSBCBank implements USBank,BrazilBank { // multiple inheritance
	public void credit() {
		System.out.println("hsbc credit");
	}
	public void debit() {
		System.out.println("hsbc debit");
	}
	public void transfermoney() {
		System.out.println("hsbc transfer money");
	}
	public void mutualFund() {
		System.out.println("hsbc bank mutual fund");
	}
	
	public void educationLoan() {
		System.out.println("hsbc el");
	}
	public void carLoan() {
		System.out.println("hsbc carloan");
	}

}
