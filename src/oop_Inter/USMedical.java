package oop_Inter;

public interface USMedical extends WHO{
	public void physioServices();
	
	public void cardioServices();
	public void oncologyServices();
	public void emergencyServices();
	public static void billing() {
		System.out.println("USMedical billing");
	}
	
	//after jdk 1.8
	//1.you can have static methods with the body
	//2.can have default method with method body(non static)
	default void medInsurance() {
		System.out.println("default med insu");
	}

}
