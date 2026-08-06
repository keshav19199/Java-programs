package java_prog.StreamAPI_Revision;

import java.util.function.Predicate;

public class Predicate_1 {

	public static void main(String[] args) {

		Predicate<Integer> even=(s)->{return s % 2==0;};
		
		System.out.println(even.test(4));
		
		Predicate<Integer> gret=even.and((g)->{return g>10;});
		
		System.out.println(gret.test(91));
		
		
	}

}
