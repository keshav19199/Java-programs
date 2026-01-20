package java_prog.stream_Operations;

import java.util.List;

public class Limit1 {

	public static void main(String[] args) {

		List.of(32,12,43,76,98,43,243,67,87)
		.stream()
		.limit(3)
		.forEach((a)->{System.out.println(a);});
	}

}
