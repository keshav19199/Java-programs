package java_prog.LambdaExpre;

import java.util.function.Function;

public class Function2 {
	public static void main(String args[]) {
		
		Function<Integer, Integer> sq=s->s*s;
		Function<Integer, Integer> add=l->l+10;
		
		System.out.println(sq.andThen(add).apply(5));
		
		Function<Integer, Integer> s=Function.identity();
		System.out.println(s.apply(100));
		
	}
}
