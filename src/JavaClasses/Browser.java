package JavaClasses;

public class Browser {
	String name;
	double version;
	String vendor;
	public void browseref(Browser br) {
		System.out.println(br.name+" "+br.version+" "+br.vendor);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.name="Chrome";
		b.version=1.0;
		b.vendor="Google";
		b.browseref(b);//call by ref
		b.sum(10, 20);//pass by value
	}
}
