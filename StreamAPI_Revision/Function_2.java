package java_prog.StreamAPI_Revision;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {

		Function<String, Integer> fun=(s)-> s.length();
		
		System.out.println(fun.apply("Keshav wadhavane"));
	}

}
