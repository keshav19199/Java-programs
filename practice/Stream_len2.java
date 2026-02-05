package java_prog.practice;

import java.util.List;

public class Stream_len2 {

	public static void main(String[] args) {

		List.of("qw","ew","ewew")
		.stream()
		.map((i) -> {return i.length();})
		.forEach((s) -> {System.out.println(s);});
	}

}
