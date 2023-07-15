package oopInheritance;

public class BMW extends Car{
	
	//override method
	//will always happen between parent and child
	//same name and same number of parametes
	//private method cannot be overwritten
	//static method cannot be overriding
	//polymorphism-run time polymorphism dynamic polymorphism
	//static polymorphism
	@Override
	public void start() {
		System.out.println("BMW------Start()");
	}
	public void autoParking() {
		System.out.println("BMW-----autoparking");
	}
	//@Override
	//public static void drive() {
		//System.out.println("bmw drive");
	//}

}
