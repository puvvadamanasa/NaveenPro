package JavaClasses;

public class ObjectRef {
	String name;
	int age;
	public void get() {
		System.out.println("Get method");
	}

	public static void main(String[] args) {
		ObjectRef o = new ObjectRef();
//		o=null;
//		o.name="manasa";
//		o.age=25;//null reference
//		System.out.println(o.name+" "+o.age);//nul pointer exception
		new ObjectRef().name="hj";
		new ObjectRef().age=25;
		new ObjectRef().get();//3 objects will ge cretatrd
		new ObjectRef().name="sdjf";
		new ObjectRef().age=2455;
		new ObjectRef().get();//no reference
		System.gc();
		
	

	}

}
