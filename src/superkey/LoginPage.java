package superkey;

public class LoginPage extends Page
{
	int timeout=200;
	public LoginPage() {
		super(10,20);
		System.out.println("LoginPage def const");
	}
	
	public void logininfo() {
		System.out.println("Logininfo");
		//display();
	}
	public void gettimeout() {
		System.out.println(timeout);
		System.out.println(super.timeout);
	}
	@Override
	public void display() {
		System.out.println("Loginpage display");
		super.display();
		
	}
}
