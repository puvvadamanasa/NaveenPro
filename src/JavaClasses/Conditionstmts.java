package JavaClasses;

public class Conditionstmts {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		if(a==b) {
			System.out.println("Both are equal");
		}
		if(false) {
			System.out.println("Hai");
		}
		else {
			System.out.println("bye");
		}
		boolean be=true;
		if(be) {
			System.out.println("Hai");
		}
		else {
			System.out.println("Bye");
		}
		int number=101;
		if(number<=100) {
			if(number>=90) {
				System.out.println("Grade A");
			}
			if(number>=75) {
				System.out.println("Grade B");
			}
		}
		else {
			System.out.println("Invalid number");
		}
//		String browser="IE";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("firefox");
//		}
//		if(browser.equals("Opera")) {
//			System.out.println("Opera");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("IE");
//		}
//		else {
//			System.out.println("Invalid");
//		}
		String browser="IE";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox");
		}
		else if(browser.equals("Opera")) {
			System.out.println("Opera");
		}
		else if(browser.equals("IE")) {
			System.out.println("IE");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
