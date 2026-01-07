package java_prog.StreamAPI;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

		Predicate<Integer> p1=(i)->{
			return i%2==0;};
			System.out.println(p1.test(32));
	}

}
