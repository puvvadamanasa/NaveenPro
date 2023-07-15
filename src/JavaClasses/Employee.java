package JavaClasses;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	boolean isperm;
	char gender;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="Manasa";
		e1.age=25;
		e1.city="Hyde";
		e1.salary=10.25;
		e1.isperm=true;
		e1.gender='F';
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary+" "+e1.isperm+" "+e1.gender);
		Employee e2 = new Employee();
		e2.name="peter";
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary+" "+e2.isperm+"  "+e2.gender);
		
		

	}

}
