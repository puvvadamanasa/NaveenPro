package JavaClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		Object[] player1=new Object[6];
		player1[0]="Kohli";
		player1[1]=35;
		player1[2]="India";
		player1[3]="12/12/1985";
		player1[4]="Male";
		player1[5]=12.5;
		Object[] player2=new Object[6];
		player2[0]="Sachin";
		player2[1]=40;
		player2[2]="India";
		player2[3]="12/12/1975";
		player2[4]="Male";
		player2[5]=100.0;
		Object[] player3=new Object[6];
		player3[0]="Sehwag";
		player3[1]=89;
		player3[2]="India";
		player3[3]="12/12/1915";
		player3[4]="Male";
		player3[5]=10.0;
		for(int i=0;i<player1.length;i++) {
			System.out.print(player1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<player2.length;i++) {
			System.out.print(player2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<player3.length;i++) {
			System.out.print(player3[i]+" ");
		}
		System.out.println();
		ArrayList<String> col = new ArrayList<>();
		col.add("Red");
		col.add("green");
		col.add("ui");
		System.out.println(col);
		ArrayList<Integer> col1 = new ArrayList<>();
		col1.add(10);
		col1.add(20);
		col1.add(30);
		col1.add(40);
		col1.add(50);
		col1.remove(2);
		System.out.println(col1);
		
		System.out.println("--------------------------------");
		ArrayList<String> col2 = new ArrayList<>();
		col2.add("Red");
		col2.add("Orange");
		col2.add("black");
		System.out.println(col2);
		String s = col2.set(1, "White");
		System.out.println(s);
		System.out.println(col2);
		System.out.println("--------------------------------------------");
		ArrayList<Integer> col3 = new ArrayList<>();
		col3.add(10);
		col3.add(20);
		col3.add(30);
		col3.add(40);
		col3.add(50);
		int j=30;
		for(int i=0;i<col3.size();i++) {
			if(col3.get(i)==j) {
				//System.out.println(col3.get(i));
				break;
			}
			System.out.println(col3.get(i));
		}
		System.out.println("--------------------------------------------");
		ArrayList<String> l = new ArrayList<>();
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("Balck");
		l.add("White");
		System.out.println(l);
		List<String> l1  = l.subList(0, 3);
		System.out.println(l1);
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Red");
		l2.add("Green");
		l2.add("Orange");
		l2.add("Black");
		l2.add("White");
		//System.out.println(l2.removeAll(l2));
		System.out.println(l2.size());
		l2.trimToSize();
		System.out.println(l2);
		for(int i=0;i<l2.size();i++) {
			System.out.println(i+" "+l2.get(i));
		}
		}

	}


