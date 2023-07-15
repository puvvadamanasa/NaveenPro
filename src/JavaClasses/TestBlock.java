package JavaClasses;

public class TestBlock {
	static {
		System.out.println("static");
	}
	public void test() {
		System.out.println("test()");
	}

	public static void main(String[] args) {
		TestBlock t = new TestBlock();
		//t.test();

	}

}
