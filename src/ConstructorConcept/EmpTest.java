package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Manasa";
		e.age=20;
		e.gender='f';
		e.id=100;
		e.isperm=true;
		Employee e1 = new Employee(10);
		Employee e2 = new Employee("Man", 201);
		System.out.println(e2.name+" "+e2.id+" "+e2.age+" "+e2.gender+" "+e2.isperm);
		Employee e3 = new Employee("Man", 201);
		System.out.println(e3.name+" "+e3.id);
		Employee e4 = new Employee("Jaasritha", 231, 23, 12.5,true,'f');
		System.out.println(e4.name+" "+e4.id+" "+e4.age+" "+e4.gender+" "+e4.isperm);
		Users u1 = new Users("Naveen", "Bang");
		Users u2 = new Users("klo", 123, "Hyd");
		Users u3 = new Users("nmb", 1235, true, "pune");
		//MySystem s = new MySystem();

	}

}
