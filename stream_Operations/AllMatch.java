package java_prog.stream_Operations;

import java.util.List;

public class AllMatch {

	public static void main(String[] args) {

		System.out.println(
		List.of(2,3,65,87,3,12,32,45,65)
		.stream()
		.allMatch((m)->{return m<10;}));	// it work like a &&, return boolean value
		
	}

}
