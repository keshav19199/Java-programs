package java_prog.StreamAPI;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(i)->{return i.length();};
		
		Function<Integer, Integer> fun2=(s)->{return s*3;};
		
		
		System.out.println(fun.apply("Welcome"));
		System.out.println(fun2.apply(10));
		
		Function<String, Integer> fun3=fun.andThen(fun2);
		
		System.out.println(fun3.apply("hello"));
		
	}

}
