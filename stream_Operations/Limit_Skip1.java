package java_prog.stream_Operations;

import java.util.List;

public class Limit_Skip1 {

	
	public static void main(String[] args) {

		List.of(32,43,65,87,98,65,33,23)
		.stream()
		.limit(7)
		.skip(4)
		.forEach((t)->{System.err.println(t);});
	}

}
