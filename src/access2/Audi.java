package access2;

import accessmodi.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		Car c = new Car();
		c.color="blue";
		
		Audi a = new Audi();
		a.color="red";
		a.price=12;
	}
}
