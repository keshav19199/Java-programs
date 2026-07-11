package java_prog.LambdaExpre;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {

		Function<Integer, Integer> s=n-> n*n;
		System.out.println(s.apply(10));
		
		//methods- apply 
		
		Function<String, String> u=k->k.toUpperCase();
		System.out.println(u.apply("Keshav"));
		
		Function<String, Integer> length= l->l.length();
		System.out.println(length.apply("Keshav w"));
	}

}
