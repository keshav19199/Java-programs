package java_prog.StreamAPI;

import java.util.function.Predicate;

public class Predicate4 {

	public static void main(String[] args) {

		Predicate<Integer> p1=(i)->{return i==5;};
		Predicate<Integer> p2=(i)->{return i<10;};
		
		
		Predicate<Integer>p3=p2.negate();
		System.out.println(p3.test(5));
	}

}
