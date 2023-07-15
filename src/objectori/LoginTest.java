package objectori;

import ConstructorConcept.MySystem;

public class LoginTest {

	public static void main(String[] args) {
		Loginpage lp = new Loginpage();
		lp.setUsername("Mansa");
		lp.setPassword("Manasa@1993");
		lp.login(lp.getUsername(), lp.getPassword());
		lp.setPassword("iop");
		lp.login(lp.getUsername(), lp.getPassword());
		Loginpage lp1 = new Loginpage();
		lp1.login(lp1.getUsername(), lp1.getPassword());
		//MySystem s = new MySystem();
	}
}
