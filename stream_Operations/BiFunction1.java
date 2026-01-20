package java_prog.stream_Operations;

import java.util.function.BiFunction;

public class BiFunction1 {

	public static void main(String[] args) {

		BiFunction<String, String[], Integer>
		bi=(t,u)->{return t.length() + u.length; };
		
		System.out.println(bi.apply("ew", new String[] {"abc","ddg"}));
	}

}
