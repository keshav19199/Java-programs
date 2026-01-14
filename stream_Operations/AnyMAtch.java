package java_prog.stream_Operations;

import java.util.List;

public class AnyMAtch {

	public static void main(String[] args) {

		System.out.println(
				List.of(1,2,3,4,5,6,7,7,8,99,6,43,43,54,6,787,66)
				.stream()
				.anyMatch((a)->{return a%2==0;}));
		
		// it work like || 
		// in this no for each direct print 
		
	}

}
