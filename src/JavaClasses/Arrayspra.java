package JavaClasses;

import java.util.Collection;

public class Arrayspra {

	public static void main(String[] args) {
		int[] i = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i);
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		System.out.println("Hi "+ (i.length-1));
		System.out.println("Li "+ 0);
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		System.out.println("-------------------------------");
		for(int e:i) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------");
		double[] d= new double[3];
		d[0]=100;
		d[1]=12.3;
		d[2]=4.5;
		System.out.println(d[0]);
		for(double u:d) {
			System.out.println(u);
		}
		System.out.println("--------------------------------------");
		char[] c=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
	    for(int l=0;l<c.length;l++) {
	    	System.out.println((int)c[l]);
	    }
	    for(char f:c) {
	    	System.out.println((int)f);
	    }
	    String[] s=new String[4];
	    s[0]="Manasa";
	    s[1]="Java Script";
	    s[2]="Klo";
	    s[3]="Iop";
	    System.out.println(s[0]+s[1]);
	    for(int k=0;k<s.length;k++) {
	    	System.out.println(k+": "+s[k]);
	    }
	    for(String s1:s) {
	    	System.out.println(s1);
	    }
	    Object[] o = new Object[4];
	    o[0]=100;
	    o[1]=45.6;
	    o[2]='a';
	    o[3]="Manasa";
	    for(Object o1:o) {
	    	System.out.println(o1);
	    }
	    String[] s5 = new String[100];
	    s[0]="oil";
	    s[1]="iop";
	    
	    for(int q=0;q<8;q++) {
	    	for(int y=0;y<8;y++) {
	    		System.out.print(q+""+y+"  ");
	    	}
	    	System.out.println();
	    }
	   
	    
	    
	    

	}

	
	}


