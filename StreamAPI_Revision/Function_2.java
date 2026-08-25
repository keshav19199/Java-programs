package java_prog.StreamAPI_Revision;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(s)-> s.length();
		Function<String, String> fun2=(s1)-> s1.concat("Okay");
		
		Function<String, Integer> fun3=fun.compose(fun2);
		
		System.out.println(fun.apply("Keshav wadhavane"));
		System.out.println(fun2.apply("Hello"));
		
		System.out.println(fun3.apply("k"));
	}

}
