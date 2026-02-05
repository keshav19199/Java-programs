package java_prog.practice;

import java.util.List;
import java.util.function.BinaryOperator;

public class stream_Sum {

	public static void main(String[] args) {

		BinaryOperator<Integer> bi=(a,b) -> (a+b);
		
		int sum=List.of(12,3,4,5)
				.stream()
				.reduce(0, bi);
		
		System.out.println(sum);
		
	}

}
