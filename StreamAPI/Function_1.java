package java_prog.StreamAPI;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(i)->{return i.length();};
		
		System.out.println(fun.apply("Welcome"));
	}

}
