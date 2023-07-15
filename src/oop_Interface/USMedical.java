package oop_Interface;

public interface USMedical {
	
	public void physioservices();
	public void cardioservices();
	public void oncologyservices();
	public void test();
	public void emergencyservices();
	public static void billing() {
		System.out.println("US Medical billing");
	}

}
