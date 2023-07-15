package ConstructorConcept;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("nmb", 20, "IBM");
		System.out.println(c1.getAge());
		System.out.println(c1.getCompany());
		System.out.println(c1.getName());
		String s = c1.getCustomerInfo();
		System.out.println(s);
		c1.setCompany("Microsoft");
		 s = c1.getCustomerInfo();
		System.out.println(s);
		Customer c2 = new Customer();
		c2.setCompany("Google");
		c2.setAge(45);
		c2.setName("opi");
		System.out.println(c2.getCompany());
		System.out.println(c2.getAge());
		System.out.println(c2.getName());
		

	}

}
