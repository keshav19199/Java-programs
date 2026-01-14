package java_prog.stream_Operations;

import java.util.List;

public class Filter1 {

	public static void main(String[] args) {

		List.of(12,32,43,9,2,3,4,6,21,65,98,13)
		.stream()
		.filter((i)->{return i<10;})
		.forEach((s)->{System.out.println(s);});
		
	}

}
