package java_prog.challeges.StreamAPI;

import java.util.function.BinaryOperator;

public class Challenge_106 {

	public static void main(String[] args) {

		BinaryOperator<Integer> multi=(a,b)-> (a*b);
		
		System.out.println(multi.apply(4, 3));
	}

}
