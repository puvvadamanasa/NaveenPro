package JavaClasses;

public class PracticeMeth {
	float pi = 3.14f;
	public void areaOfCircle(int r) {
		double area=pi*r*r;
		System.out.println(area);
	}
	public void circum(int r) {
		double c = 2*pi*r;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		PracticeMeth p = new PracticeMeth();
		p.areaOfCircle(2);
		p.circum(3);
		

	}

}
