package JavaClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListc {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10,20,30,40));
		System.out.println(l);
		int[] i = {10,20,30,40};
		System.out.println(i);
		System.out.println(Arrays.toString(i));
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Java","Python","JavaScript"));
		System.out.println(names);
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","C","B","D","F"));
		ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B","A","C","D","F"));
		Collections.sort(l3);
		System.out.println(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		//l4.removeAll(l5);
		//System.out.println(l4);
		//System.out.println(l5);
		l5.removeAll(l4);
		System.out.println(l4);//abcdf
		System.out.println(l5);//E
		ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("PHP","DS","Java","Python","RPI"));
		ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("PHP","DS","Java","Python","SI"));
		//lang1.retainAll(lang2);
		//System.out.println(lang1);
		lang2.retainAll(lang1);
		System.out.println(lang2);
		ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l7 = new ArrayList<>(Arrays.asList("p","q","r"));
		l6.addAll(l7);
		System.out.println(l6);
		System.out.println(l7);
		//l7.clear();
		//System.out.println(l7);
		ArrayList<String> a = (ArrayList<String>)l7.clone();
		System.out.println(a);
		ArrayList<String> l8 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		//l8.add(0, "T");
		//System.out.println(l8);
		l8.add(8,"N");
		System.out.println(l8);
		
		
		
		
		
		

	}

}
