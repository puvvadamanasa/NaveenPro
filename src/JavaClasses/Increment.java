package JavaClasses;

public class Increment {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		System.out.println(s1+s2);
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(a+b);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		System.out.println("The sum is: "+c);
		System.out.println("The sum is: "+(a+b));
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
		System.out.println(b1+b2);
		//System.out.println(0/0);
		System.out.println(0/0.0);
		System.out.println(0.0/0);
		System.out.println(0.0/0.0);
		System.out.println(10/0.0);
		System.out.println(5.5/0);
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);
		System.out.println((int)c1);
		int q=2;
		int w=q++;
		System.out.println(q);//3
		System.out.println(w);//2
		int y=-3;
		int u=++y;
		System.out.println(y);//-2
		System.out.println(u);//-2
		System.out.println(q++);
		System.out.println(q);
		System.out.println(++q);
		System.out.println(q);
		int x=7;
		int f=--x;
		System.out.println(f);//6
		System.out.println(x);//6
		int n=-87;
		int v=n--;
		System.out.println(v);//-87
		System.out.println(n);//-88
		
	}

}
