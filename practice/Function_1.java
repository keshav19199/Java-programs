package java_prog.practice;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(i) -> {return i.length();};
		
		System.out.println(fun.apply("welcome"));
		
		Function<Integer,Integer> fun2=(i) -> {return i*5;};
		
		System.out.println(fun2.apply(5));
		
		Function<String, Integer> fun3=fun.andThen(fun2);
		System.out.println(fun3.apply("99"));
		
		
	}

}
