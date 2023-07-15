package JavaClasses;

public class FinPract {

	public static void main(String[] args) {
		byte a=10;//1 byte
		byte b=30;
		System.out.println(a+b);
		int c = a+b;
		System.out.println(c);
		short s1 = 100;
		short s2 =200;//2 byte
		System.out.println(s1);
		System.out.println(s1+s2);
		int s3 = s1+s2;//4
		System.out.println(s3);
		long l=1009989L;//8
		System.out.println(l);
		float f=12.5f;
		System.out.println(f);
		float f1=100;
		System.out.println(f1);
		float f2=(float)12.5;
		System.out.println(f2);
		double d=12.87687;
		System.out.println(d);
		char c1='a';
		System.out.println(c1);
		char c2='b';
		System.out.println(c1+c2);
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		//30 31 32 33
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(i+""+j+"  ");
			}
			System.out.println();
		}
				
		
		

	}

}
