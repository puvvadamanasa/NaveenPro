package mapConcept;

import java.util.HashMap;

public class Employee {
	public static void main(String[] args) {
		HashMap<String, String> emp = new HashMap<>();
		emp.put("A", "Tom");
		emp.put("B", "Peter");
		emp.put("C", "klo");
		emp.put(null, "pop");
		emp.forEach((k,v)->System.out.println(k+" : "+v));
		System.out.println(emp.get("A"));
		HashMap<String, Integer> stu = new HashMap<>();
		stu.put("Tom", 100);
		stu.put("Peter", 200);
		stu.put("Naveen", 300);
		stu.forEach((k,v)->System.out.println(k+"  :  "+v));
		//stu.put(null, 300);
		//stu.put(null, 400);
		//stu.put(null, 500);
		System.out.println(stu.get(null));
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(100, 100);
		map.put(200, 200);
		map.put(300, 300);
	}

}
