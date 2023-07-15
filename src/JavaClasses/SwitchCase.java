package JavaClasses;

public class SwitchCase {

	public static void main(String[] args) {
		String browser=" CHROME ";
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome");
			break;
		case "firefox":
			System.out.println("firefox");
			break;
		case "IE":
			System.out.println("IE");
			break;
		default:
			System.out.println("Invalid");		
		}
		int marks=100;
		switch(marks) {
		case 90:
			System.out.println("Grade A");
			break;
		case 98:
			System.out.println("Grade B");
			break;
		default:
			System.out.println("Invalid");
		}
		
		double d1=12.34;
		double d2=12.35;
		if(d1==d2) {
			System.out.println("Hai");
		}
		else {
			System.out.println("Bye");
		}

	}

}
