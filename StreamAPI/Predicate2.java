package java_prog.StreamAPI;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {

		Predicate<String> p1=(i)->{
		StringBuffer sb=new StringBuffer(i);
		String s1=sb.reverse().toString();
		return i.equals(s1);};
		Predicate<String> p2=(s)->{return s.length()>4;};
		
		Predicate<String> p3=p1.and(p2);
		
		System.out.println(p3.test("madam"));
	}

}
