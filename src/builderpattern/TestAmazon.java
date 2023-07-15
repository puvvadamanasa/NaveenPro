package builderpattern;

public class TestAmazon {

	public static void main(String[] args) {
		EcommApp e = new EcommApp();
		e.login("jk", "vg123").search().doPayment("123");
		

	}
}