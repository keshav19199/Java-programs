package java_prog.StreamAPI.Method_ref;

import java.util.List;

public class First {

	public static void main(String[] args) {

		String str="Hello, ";
		
		List.of("Pune","Parner","Mumbai","Dhehradhun","Goa","Kedarnath")
		.stream()
		.map(str::concat)
		.forEach(i -> System.out.println(i));

	}

}
