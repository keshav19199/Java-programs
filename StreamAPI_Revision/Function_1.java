package java_prog.StreamAPI_Revision;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(s)->{return s.length();};
		System.out.println(fun.apply("keshava"));
		
		Function<String, String> fun2=(p)->{return p+"abc";};
		
		Function<String, Integer> fun3=fun.compose(fun2);
		
		System.out.println(fun3.apply("Chandra"));
	}

}
