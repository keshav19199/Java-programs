package java_prog.stream_Operations;

import java.util.List;

public class Map1 {

	public static void main(String[] args) {

		System.out.println("Lengrth the String: ");
		List.of("abc","pqrst","qwerty","kk")
		.stream()
		.map((s)->{return s.length();})
		.forEach((i)->{System.out.println(i);});
		
		System.out.println("******************");
		System.out.println("Reverce String: ");
		List.of("keshav","karan","sahil","rohan")
		.stream()
		.map((s)->{return new StringBuffer(s).reverse().toString();})
		.forEach((s)->{System.out.println(s);});
	}

}
