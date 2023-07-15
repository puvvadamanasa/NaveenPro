package objectori;

public class CompanyTest {

	public static void main(String[] args) {
		Company c = new Company();
		c.name="IBM";
		c.hq="Hyd";
		c.setsp(2);
		int sp = c.getsp();
		System.out.println(sp);
		

	}

}
