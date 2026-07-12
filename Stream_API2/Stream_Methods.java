package java_prog.Stream_API2;

import java.util.List;

public class Stream_Methods {

	public static void main(String[] args) {

		List<String> list=List.of("Keshav","sahil","rohan","abhi","patil","kadambari");
	
		list.stream()
		.filter(name->name.startsWith("r"))
		.forEach(System.out::println);
	}
}
