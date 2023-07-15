package JavaClasses;

public class Customers {
	String name;
	int id;
	static String city="Bangalore";
	static String paymentmethod="cc";
	
	public void getInfo() {
		System.out.println("Get info");
	}
	public static void sendmail() {
		System.out.println("Send mail methos");
	}

	public static void main(String[] args) {
		Customers c = new Customers();
		sendmail();
		c.getInfo();
		Customers.sendmail();
		c.sendmail();
		
		

	}

}
