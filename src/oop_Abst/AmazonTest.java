package oop_Abst;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();//page header inherited
		lp.logo();//page logo inherited
		lp.doLogin("mana", "manasa");
		lp.doLogin("sdf", "dsf", 123456);
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logo();
		hp.logout();
		
		//Page P = new Page(); not allowed
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		
		//LoginPage lp1 = (LoginPage) new Page(); downcasting is not allowed during compile time
		Page p1 = new HomePage();
		p1.title();
		p1.url();
		p1.header();
		p1.logo();
		
		
		
		

	}
}
