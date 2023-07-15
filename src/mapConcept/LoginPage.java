package mapConcept;

import java.util.HashMap;

public class LoginPage {
	public String getUserCred(String role) {
		HashMap<String, String> credmap = new HashMap<String,String>();
		credmap.put("admin", "admin@hgmail.com;admin123");
		credmap.put("customer", "customer@hgmail.com;customer");
		credmap.put("seller", "seller@hgmail.com;seller");
		credmap.put("partner", "partner@hgmail.com;partner");
		credmap.put("distributor", "distributor@hgmail.com;distributor");
		credmap.put("categorymanager", "categorymanager@hgmail.com;categorymanager");
		return credmap.get(role);
	}
	public static void doLogin(String un,String pwd){
		System.out.println("login with: "+un+":"+pwd);
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		String[] u = lp.getUserCred("categorymanager").split(";");
		//System.out.println(u[0]);
		//System.out.println(u[1]);
		String un = u[0].trim();
		String pw = u[1].trim();
		
		doLogin(un,pw);

	}

}
