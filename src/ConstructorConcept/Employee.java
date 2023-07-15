package ConstructorConcept;

public class Employee {
	String name;
	int id;
	int age;
	double salary;
	boolean isperm;
	char gender; 
	public Employee() {//0 param/default constructor
		System.out.println("default const");
	}
	public Employee(int a) {//1 param constructor
		System.out.println(a);
	}
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public Employee(String name,int id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public Employee(String name,boolean isperm) {
		this.name=name;
		this.isperm=isperm;
	}
	
	public Employee(String name, int id, int age, double salary, boolean isperm, char gender) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isperm = isperm;
		this.gender = gender;
	}
}
