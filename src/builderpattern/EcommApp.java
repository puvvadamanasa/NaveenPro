package builderpattern;

public class EcommApp {
	public EcommApp login() {
		System.out.println("Default login");
		return this;
	}
	public EcommApp login(String un,String pwd) {
		System.out.println("login with"+un+" : "+pwd);
		return this;
	}
	public EcommApp search() {
		System.out.println("default search");
		return this;
	}
	public EcommApp search(String productName) {
		System.out.println("search for"+productName);
		return this;
	}
	public EcommApp search(String productName,int rating) {
		System.out.println("search for"+productName+"  : "+rating);
		return this;
	}
	public EcommApp addtoCart(String productName) {
		System.out.println("Add to cart"+productName);
		return this;
	}
	public EcommApp doPayment(String upi) {
		System.out.println("do payment via"+upi);
		return this;
	}
	public EcommApp doPayment(String cc,int cvv) {
		System.out.println("do payment via"+cc+":"+cvv);
		return this;
	}
	public EcommApp doPayment(String cc,int cvv,int otp) {
		System.out.println("do payment via"+cc+":"+cvv+":"+otp);
		return this;
	}
	public EcommApp generateOrderId() {
		System.out.println("Order id is: "+1223);
		return this;
	}
	public EcommApp logout() {
		System.out.println("App logout");
		return this;
	}

}
