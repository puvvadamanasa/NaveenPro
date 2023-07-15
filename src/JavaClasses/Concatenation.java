package JavaClasses;

public class Concatenation {

	public static void main(String[] args) {
		String s = "Manasa";
		System.out.println(s);
		String s1="100";
		System.out.println(s1);
		String ph="8978946841";
		System.out.println(ph);
		System.out.println(s1+ph);//concat
		int a=100;
		int b=200;
		System.out.println(a+b);//addition
		String s2="Hello";
		System.out.println(a+s2);
		System.out.println(s2+a);
		System.out.println(a+b+s2+s);
		System.out.println(s+s2+a+b);
		System.out.println(s+s2+(a+b));
		System.out.println(s+s2+a+b+a+b);
		System.out.println("the value of a: "+ a);
		System.out.println("the value of b: "+b);
		System.out.println("the sum is:"+a+b);
		System.out.println("the sum is:"+(a+b));
		System.out.println(s+"   "+s2);
		double c=12.5;
		double d=34.5;
		System.out.println(c+d+s+s2);
		System.out.println(s+s2+c+d);
		char a1='a';
		char a2='b';
		System.out.println(a1+a2);
		System.out.println(a1+""+a2);
		byte b1=60;
		byte b2=50;
		System.out.println(b1+b2);
		int add=b1+b2;
		System.out.println(add);
		int g=10;
		int h=3;
		//System.out.println(10/0);
		System.out.println(g/h);
		System.out.println(10/2);
		System.out.println(10.0/2);
		System.out.println(10/2.0);
		System.out.println(10.0/2.0);
		System.out.println(10/3.0);
		//System.out.println(9/0);
		System.out.println(0/9);
		//System.out.println(0/0);
		System.out.println(0/0.0);//nan
		System.out.println(0.0/0);//nan
		System.out.println(0.0/0.0);//nan
		System.out.println(5/0.0);//infinity
		System.out.println(5.0/0.0);//infinity
		System.out.println(5.0/0);//infinity
		char f='a';
		System.out.println((int)f);
	}
}
