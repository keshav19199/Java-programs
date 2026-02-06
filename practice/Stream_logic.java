package java_prog.practice;

import java.util.List;

public class Stream_logic {

	public static void main(String[] args) {

		List.of(12,3,1,4,65,23,45)
		.stream()
		.filter((i) -> {return i>20;})
		.forEach((i) -> {System.out.println(i);});
	}

}
