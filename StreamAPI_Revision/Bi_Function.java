package java_prog.StreamAPI_Revision;

import java.util.function.BiFunction;

public class Bi_Function {

	public static void main(String[] args) {

		BiFunction<String, String, Integer> bi=(i,j)->(i.length()+j.length());
		System.out.println(bi.apply("hello", "by"));
	}

}
