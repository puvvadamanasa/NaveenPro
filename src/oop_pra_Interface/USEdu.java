package oop_pra_Interface;

public interface USEdu extends Global{
	public void eng();
	public void sci();
	public void social();
	public void general();
	public static void usedu() {
		System.out.println("usedu static");
	}
	default void use(){
		System.out.println("u---------------------");
	}
}
