package JavaClasses;

public class WhileLoop {

	public static void main(String[] args) {
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
			//System.out.println(i);
		}
		System.out.println("------");
		int j=1;
		for(;j<=10;) {
			System.out.println(j);
			j++;
		}
//		for(int k=1;k<=10;) {
//			System.out.println(k);
//		}
//		for(;;) {
//			System.out.println("Welcome to hotel taj");
//		}
		System.out.println("-----");
		for(int l=2;l<=10;l++) {
			if(l%2==0) {
				System.out.println(l);
			}		
		}
		System.out.println("---");
		for(int o=1;o<=10;o=o+2) {
			System.out.println(o);
		}
		System.out.println("---");
		for(double u=1.0;u<=10.0;u++) {
			System.out.println(u);
		}
		for(char c='A';c<='Z';c++) {
			System.out.println(c);
		}
		for(int as=97;as<=122;as++) {
			System.out.println((char)as);
		}
		for(int ij=1;ij<=100;ij++) {
			System.out.println(ij);
			if(ij%5==0) {
				System.out.println("Hai");
			}
		}
		System.out.println("-------------------------------------------------");
		for(int im=1;im<=100;im++) {
			if(im%2==0) {
				System.out.println(im);
			}
		}
		System.out.println("-------------------------------------------------");
		for(int ui=1;ui<=100;ui++) {
			if(ui%2!=0) {
				System.out.println(ui);
			}
		}
		System.out.println("-------------------------------------------------");
		int r=1;
		do {
			r++;
			System.out.println(r);
			
		}
		while(r<=10);
	}

}
