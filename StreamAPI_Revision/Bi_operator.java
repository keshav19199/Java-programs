package java_prog.StreamAPI_Revision;

import java.util.function.BinaryOperator;

public class Bi_operator {

	public static void main(String[] args) {

		BinaryOperator<Integer> biop=(i,j)->(i+j);
		
		System.out.println(biop.apply(12, 2));
	}

}
