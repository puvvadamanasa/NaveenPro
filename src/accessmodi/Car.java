package accessmodi;

public class Car {
	String name;
	public String color;
	protected int price;
	private int licensenumber;

	public static void main(String[] args) {
		Car c = new Car();
		c.name="bmw";
		c.color="blue";
		c.price=12;
		c.licensenumber=1234;

	}

}
