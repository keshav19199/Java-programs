package java_prog.practice;

import java.util.List;
import java.util.function.BinaryOperator;

public class Stram_Sum {

	public static void main(String[] args) {

		BinaryOperator<Integer> bi=(a,b) -> (a+b);
		
		int sum=List.of(1,2,3,4,5).stream().reduce(0, bi);
		
		System.out.println(sum);
	}

}
