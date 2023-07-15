package superkey;

public class Page {
	int timeout=100;
	public Page() {
		System.out.println("Page def");
	}
	public Page(int a) {
		System.out.println(a);
	}
	public Page(int a,int b) {
		System.out.println(a+b);
	}
	public void display() {
		System.out.println("display");
	}

}
