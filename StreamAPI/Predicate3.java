package java_prog.StreamAPI;

import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {

		Predicate<String> p1=(s)->{
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		return s.equals(s1);
		};
		System.out.println(p1.test("appa"));
	}

}
