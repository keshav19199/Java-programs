package java_prog.challeges.Functional;

import java.util.stream.IntStream;

public class Challenge_111 {
		public static void main(String args[]) {
			
			IntStream.rangeClosed(1, 5)	//factorial calculate
			.reduce((a,b)->a*b)
			.ifPresent(System.out::println);
		}
}
