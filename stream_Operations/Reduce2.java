package java_prog.stream_Operations;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce2 {

	public static void main(String[] args) {

		// multiplication 
		
		BinaryOperator<Integer> e=(w,v)->(w*v);
		
		int str=List.of(4,5,6)
				.stream()
				.reduce(1, e);
				
				System.out.println(str);
		}

}
