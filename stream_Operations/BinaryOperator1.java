package java_prog.stream_Operations;

import java.util.function.BinaryOperator;

public class BinaryOperator1 {

	public static void main(String[] args) {

		BinaryOperator<Integer> bi=(i,j)->{return i+j;};
		
		System.out.println(	bi.apply(32, 8));

	}
}
