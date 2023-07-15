package oop_Abst;

public class LoginPage extends Page{
	public LoginPage() {
		System.out.println("Login page default");
	}
	@Override
	public void title() {
		System.out.println("lp--title");
	}
	@Override
	public void url() {
		System.out.println("lp--url");
	}
	public void doLogin(String un,String pwd) {
		System.out.println(un+""+pwd);
	}
	public void doLogin(String un,String pwd,long ph) {
		System.out.println(un+""+pwd+" "+ph);
	}

}
