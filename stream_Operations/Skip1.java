package java_prog.stream_Operations;

import java.util.List;

public class Skip1 {

	public static void main(String[] args) {

		List.of(2,4,67,98,6,9,64,1)	// skip is first 4 elements skip and print to other.
		.stream()
		.skip(4)
		.forEach((e)->{System.out.println(e);});
	}

}
