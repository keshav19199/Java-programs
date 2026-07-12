package java_prog.Stream_API2;

import java.util.List;

public class Stream_1 {

	public static void main(String[] args) {

		List<Integer> l=List.of(10,11,12,13,14,15);
		System.out.println("Total Element: "+l.stream().count());
		
		l.stream().filter(n -> n>=14).forEach(System.out::println);	
	}

}
