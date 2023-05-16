package collections;

class Encap {
	private int a ;
	private int y ;
	String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Encap(int a, int y, String s) {
		super();
		this.a = a;
		this.y = y;
		this.s = s;
	}

}
