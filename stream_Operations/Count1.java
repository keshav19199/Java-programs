package java_prog.stream_Operations;

import java.util.List;

public class Count1 {

	public static void main(String[] args) {

		long c = List.of(12,32,43,65,798,45,32)
		.stream()
		.filter(e -> e > 20 && e<100)
		.count();
		
		System.out.println(c);
		
				
	}

}
