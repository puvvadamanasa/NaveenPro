package JavaClasses;

import java.util.ArrayList;

public class ArrayListMeth {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		i.add(50);
		i.add(60);
		
		for(int l:i) {
			System.out.println(l);
		}
		ArrayList<Double> j = new ArrayList<>();
		j.add(10.5);
		j.add(20.2);
		j.add(30.6);
		for(double l:j) {
			System.out.println(l);
		}
		ArrayList<String> o = new ArrayList<>();
		o.add("Manasa");
		o.add("jksh");
		o.add("slks");
		o.add("slkjs");
		for(String o1:o) {
			System.out.println(o1);
		}
		ArrayList<Object> po = new ArrayList<>();
		po.add("Manasa");
		po.add(22);
		po.add(true);
		po.add(12.5);
		po.add('c');
		System.out.println(po.size());
		for(Object o1:po) {
			System.out.println(o1);
		}
	}
}
