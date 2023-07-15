package JavaClasses;

public class Ecomm {
	public void login() {
		System.out.println("default login");
		
	}
	public void login(String uname,String pwd) {
		System.out.println("Login with uname and pwd");
		
	}
	public void login(String uname,String pwd,int otp) {
		System.out.println("Login with uname and pwd and otp");
		
	}
	public int login(int otp, String uname) {
		return otp;
	}
     public void login(String uname,int otp) {
		
	}
     public void login(long ph,int otp) {
    	 System.out.println(ph+" "+otp);
     }
     public void login(int otp,long ph) {
    	 System.out.println(ph+" "+otp);
     }

	public static void main(String[] args) {
		Ecomm e = new Ecomm();
		e.login();
		e.login("mana", "pop");
		e.login(12, "buddi");
	}

}
