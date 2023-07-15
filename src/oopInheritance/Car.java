package oopInheritance;

public class  Car extends Vehicle{
	public final void logo() {
		System.out.println("final");
	}
	
	@Override
	public void start() {
		System.out.println("Car---- start");
	}
    public void stop() {
		System.out.println("Car------stop");
	}
    public void refuel() {
    	System.out.println("Car------refuel");
    }
    public static void drive() {
    	System.out.println("drive----car");
    }
}
