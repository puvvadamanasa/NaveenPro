package JavaClasses;

public class FunctionsinJava {
	
	public void test() {
		System.out.println("test method");
		int i=10;
		System.out.println(i);
	}
	
	public void getprint() {
		System.out.println("Print my paper");	
	}
	public int getBalance() {
		System.out.println("Get balance");
		int fee=10;
		int tax=5;
		int total=fee+tax;
		return total;
	}
	public String getTrainerName() {
		System.out.println("Trainer");
		String name="veeru";
		return name;
	}
	public boolean isEmpActive() {
		System.out.println("isEmpActive");
		return true;
	}
	public int add(int a,int b) {
		int z=a+b;
		return z;
	}
	public int getcCourseFee(String courseName) {
		if(courseName.equals("Selenium")) {
			return 100;
		}
		else if(courseName.equals("API")) {
			return 200;
		}
		else if(courseName.equals("Java")) {
			return 300;
		}
		else {
			System.out.println("course not found");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		FunctionsinJava o = new FunctionsinJava();
		o.test();
		o.getprint();
		int i = o.getBalance();
		System.out.println(i);
		System.out.println(o.getBalance());
		String s = o.getTrainerName();
		System.out.println(s);
		if(o.isEmpActive()) {
			System.out.println("test pass");
		}
		int a = o.add(10, 20);
		System.out.println(a);
		int b = o.add(100, 20);
		System.out.println(b);	
		int p = o.getcCourseFee("AI");
		System.out.println(p);
		if(p==-1) {
			System.out.println("Pass");
		}
	}
}
