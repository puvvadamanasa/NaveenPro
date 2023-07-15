package JavaClasses;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		User u1 = new User();
		u1.name="jks";
		u1.age=20;
		u1.city="Hyd";
		User u2 = new User();
		u2.name="sdklf";
		u2.age=30;
		u2.city="Delhi";
		User u3 = new User();
		u3.name="sdk";
		u3.age=40;
		u3.city="Pune";
		System.out.println(u1.name+" "+u1.city+" "+u1.age);
		System.out.println(u2.name+" "+u2.city+" "+u2.age);
		System.out.println(u3.name+" "+u3.city+" "+u3.age);
		System.out.println("==");
		u1=u2;
		System.out.println(u1.name+" "+u1.city+" "+u1.age);//sdklf
		System.out.println(u2.name+" "+u2.city+" "+u2.age);//sdklf
		System.out.println(u3.name+" "+u3.city+" "+u3.age);//sdk
		u2=u3;
		System.out.println(u1.name+" "+u1.city+" "+u1.age);//sdklf
		System.out.println(u2.name+" "+u2.city+" "+u2.age);//sdk
		System.out.println(u3.name+" "+u3.city+" "+u3.age);//sdk
		System.out.println("---------------------------------------");
		u3=u1;
		System.out.println(u1.name+" "+u2.city+" "+u1.age);//sdklf
		System.out.println(u2.name+" "+u2.city+" "+u2.age);//sdk
		System.out.println(u3.name+" "+u3.city+" "+u3.age);//sdklf
	}
}
