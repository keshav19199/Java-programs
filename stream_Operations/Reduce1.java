package java_prog.stream_Operations;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String args[]) {
		
		//addition in reduce operation
		
		BinaryOperator<Integer> bi = (a,b) -> (a+b);
		int sum= List.of(20,10,10,30)
				.stream()
				.reduce(0, bi);
		
		System.out.println(sum);
	}
}
