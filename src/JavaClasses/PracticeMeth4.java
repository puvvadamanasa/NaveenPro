package JavaClasses;

public class PracticeMeth4 {
	public void grade(int marks) {
		if(marks>=91 && marks<=100) {
			System.out.println("Grade AA");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("Grade AB");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("Grade BB");
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("Grade BC");
		}
		else if(marks>=51 && marks<=60) {
			System.out.println("Grade CD");
		}
		else if(marks>=41 && marks<=50) {
			System.out.println("Grade DD");
		}
		else {
			System.out.println("Fail");
		}	
	}
	public void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

	public static void main(String[] args) {
		PracticeMeth4 p = new PracticeMeth4();
		p.grade(40);
		p.factorial(0);
	}

}
