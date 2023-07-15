package JavaClasses;

public class PracticeMeth3 {
	public boolean evenOrOdd(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean vote(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		PracticeMeth3 p = new PracticeMeth3();
		boolean b = p.evenOrOdd(12);
		System.out.println(b);
		boolean f = p.vote(17);
		System.out.println(f);

	}

}
