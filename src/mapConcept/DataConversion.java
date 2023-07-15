package mapConcept;

public class DataConversion {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		//String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		String y = "100A";
		//int j = Integer.parseInt(y);
		//System.out.println(j);
		String sy = y.replace("A", "");
		System.out.println(sy);
		int j = Integer.parseInt(sy);
		System.out.println(j);
		//String double
		String p="12.3";
		double d = Double.parseDouble(p);//Wrapper classes
		
		System.out.println(d);
		//int to String
		int total=100;
		String e = String.valueOf(total);
		System.out.println(e+20);

	}

}
