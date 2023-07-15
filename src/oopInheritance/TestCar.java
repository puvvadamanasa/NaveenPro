package oopInheritance;

public class TestCar {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();//overridden
		b.autoParking();//individual
		b.stop();//inherited
		b.refuel();//inherited
		b.engine();
		BMW.drive();
		b.logo();
		//static method cannot be overwritten but can be ingerited from parent
		//final keyword is used to prevent inheritance
		//if a method cannot be overwritten if it is decalred as final
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.drive();
		//child class object can be referred by parent class ref variable
		//top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		v1.start();
		//down casting is not allowed in java during runtime
		//BMW b1 = (BMW)new Car(); classcast exception
		//b1.start();
		//BMW b1 = (BMW)new Vehicle();not possible//class cast exception
		Audi a1 = new Audi();
		a1.engine();
		
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		c2.engine();
		
		Automobile ab = new BMW();
		ab.start();
		ab.stop();
		//BMW q = (BMW)new Automobile();
		
		Physics ab1 = new BMW();
		ab1.start();
		ab1.stop();
		
		Science ab2 = new BMW();
		ab2.start();
		ab2.stop();	
	}
}
