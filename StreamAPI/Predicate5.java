package java_prog.StreamAPI;

import java.util.function.Predicate;

public class Predicate5 {

	public static void main(String[] args) {

		Predicate<String> p1=(s)->{return true;};
		Predicate<String> p2=(s)->{return false;};
		
		Predicate<String> p3=p2.and(p1);
		Predicate<String> p4=p2.or(p1);
		
		System.out.println(p3.test("amol"));
		System.out.println(p4.test("amol"));
		
	}

}
