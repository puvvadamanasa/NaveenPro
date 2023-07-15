package JavaClasses;

public class PracticeMethod {
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("The sum is: "+sum);
		
	}
    public void sub(int a,int b) {
    	int sub=a-b;
    	System.out.println("Subtarction: "+sub);
		
	}
    public void mult(int a,int b) {
    	int mult=a*b;
    	System.out.println("Multiplication: "+mult);
		
	}
    public void div(int a,int b) {
    	int div=a/b;
    	System.out.println("Division: "+div);
    }
    public double multi(double a,double b) {
    	return a*b;
    }


	public static void main(String[] args) {
		PracticeMethod p = new PracticeMethod();
		p.add(10, 20);
		p.sub(10, 20);
		p.mult(10, 20);
		p.div(20, 10);
		double d = p.multi(100, 200.5);
		System.out.println(d);
	}

}
