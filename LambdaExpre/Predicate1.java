package java_prog.LambdaExpre;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

		Predicate<Integer> p=n-> n>10;
		Predicate<Integer> p2=n-> n<20;
		
		System.out.println(p.test(5));
		System.out.println(p.test(15));
		
		Predicate<Integer> result=p.and(p2);	// it works like &&
		System.out.println(result.test(100));
		
		Predicate<Integer> p3=Predicate.isEqual(10);
		System.out.println(p3.test(11));
		
		
		
	}
}
