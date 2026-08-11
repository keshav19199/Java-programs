package java_prog.StreamAPI_Revision;

import java.util.function.BiPredicate;

public class Bi_Predicate {
	public static void main(String args[]) {
		
		BiPredicate<Integer, Integer> pre=(i,j)->(i>j);
		
		System.out.println(pre.test(34, 122));
	}

}
