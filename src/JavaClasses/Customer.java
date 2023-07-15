package JavaClasses;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String productName) {
		System.out.println("Searching the product"+productName);
		ArrayList<String> l = new ArrayList<String>();
		switch(productName) {
		case "Apple":
			l.add("iphone12");
			l.add("macbook pro");
			l.add("ipad mini");
			break;
		case "Samsung":
			l.add("s8");
			l.add("samsung tablet");
			break;
		case "HP":
			l.add("headphone");
			l.add("laptop");
			break;
		default:
			System.out.println("product category not found");
			break;
		}
		return l;
	}
	public void launchBrowser(String browserName,int version) {
		if(browserName.equals("Google Chrome")) {
			System.out.println("Launch Google Chrome");
		}
		else if(browserName.equals("Firefox")) {
			System.out.println("Launch firefox");
		}
		else if(browserName.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the right browser name"+browserName);
		}
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		ArrayList<String> l = c.doSearch("H");
		System.out.println(l);
		c.launchBrowser("Safari",20);

	}

}
