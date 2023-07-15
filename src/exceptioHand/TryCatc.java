package exceptioHand;

public class TryCatc {
	String name;
    public static void main(String[] args) {
    	TryCatc c = new TryCatc();
    	c=null;
    
    	//System.out.println(c.name);
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		try {
			c.name="Tom";
			int i=9/0;
		
	      System.out.println("dlfj");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception");
			e.printStackTrace();
		}
		
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
