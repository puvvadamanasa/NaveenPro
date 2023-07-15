package stringmanipulation;

public class StringMani {

	public static void main(String[] args) {
		String s="hello This is my java code and i am happy";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		//System.out.println(s.charAt(39));
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf("code"));
		System.out.println(s.indexOf("python"));//-1
		String msg="Welcome Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("test pass");
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String str=" Hello world ";
		System.out.println(str.trim());
		System.out.println(str.replace(" " , ""));
		String dob="01-01-1990";
		System.out.println(dob.replace("-", "/"));
		String s1="your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		String t1="hello java";
		String t2 ="hello java";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		String lang="JAVA_PYTHON_RUBY_PHP";
		String[] sl = lang.split("_");
		System.out.println(sl[0]);
		System.out.println(sl[1]);
		System.out.println(sl[2]);
		System.out.println(sl[3]);
		for(String e:sl) {
			System.out.println(e);
		}
		String name="xXtestingxXjavaxXXSeleniumXxXPython";
		String[] na = name.split("xX");
		System.out.println(na[0].length());
		System.out.println(na[1]);
		System.out.println(na[2]);
		System.out.println(na[3]);
		System.out.println(na[4]);
		

	}
}
