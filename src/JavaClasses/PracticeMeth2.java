package JavaClasses;

public class PracticeMeth2 {
	public void max(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is max");
		}
		else if(b>c && b>a) {
			System.out.println(b+" is max");
		}
		else {
			System.out.println(c+" is max");
		}
	}
	public void min(int a,int b,int c) {
		if(a<b && a<c) {
			System.out.println(a+" is min");
		}
		else if(b<c && b<a) {
			System.out.println(b+" is min");
		}
		else {
			System.out.println(c+" is min");
		}
		
	}

	public static void main(String[] args) {
		PracticeMeth2 p = new PracticeMeth2();
		p.max(80, 90, 100);
		p.min(80, 100, 90);
	}

}
