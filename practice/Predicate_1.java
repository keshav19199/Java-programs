package java_prog.practice;

import java.util.List;
import java.util.function.Predicate;

public class Predicate_1 {

	public static void main(String[] args) {

		Predicate<Integer> pre=(i) -> {return i%2==0;};
		
		System.out.println(pre.test(31));
	}

}
