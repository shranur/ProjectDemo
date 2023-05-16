package collections;

public class EncapRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap ec = new Encap(1,2,"abc");
		System.out.println(ec.getA());
		System.out.println(ec.getS());
		System.out.println(ec.getY());
		
		ec.setS("Anurag");
		System.out.println(ec.getS());

	}

}
