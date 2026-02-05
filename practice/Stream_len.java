package java_prog.practice;

import java.util.List;

public class Stream_len {

	public static void main(String[] args) {

		List.of("abc","cdfer")
		.stream()
		.map((s) -> {return s.length();})
		.forEach((i) -> {System.out.println(i);});
	}

}
