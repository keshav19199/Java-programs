package java_prog.LambdaExpre;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {

		Supplier<String> s=()-> "Hello";
		System.out.println(s.get());
	}

}
