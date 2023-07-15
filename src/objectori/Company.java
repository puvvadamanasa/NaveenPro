package objectori;

public class Company {
	public String name;
	public String hq;
	private int sp;
	public void setsp(int sp) {
		this.sp=sp;
	}
	public int getsp() {
		return sp;
	}
	public static void main(String[] args) {
		Company c1 = new Company();
		c1.sp=90;
		System.out.println(c1.sp);
	}
	

}
