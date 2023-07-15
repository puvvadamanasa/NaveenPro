package JavaClasses;

public class Car {
	String name;
	String color;
	static int wheels=4;//common memory allocation
	int price;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name="BMW";
		c1.color="Blue";
		c1.price=1000;
		
		Car c2 = new Car();
		c2.name="Audi";
		c2.color="Red";
		c2.price=900;
		
		Car c3 = new Car();
		c3.name="Toyota";
		c3.color="White";
		c3.price=800;
		System.out.println(Car.wheels);
		System.out.println(c1.name+"  "+c1.color+" "+c1.price+" "+Car.wheels);
		System.out.println(c2.name+"  "+c2.color+" "+c2.price+" "+Car.wheels);
		System.out.println(c3.name+"  "+c3.color+" "+c3.price+" "+Car.wheels);

	}

}
