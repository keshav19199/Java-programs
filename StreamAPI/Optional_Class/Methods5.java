package java_prog.StreamAPI.Optional_Class;

import java.util.List;
import java.util.Optional;

public class Methods5 {

	public static void main(String[] args) {

		Optional<Integer> op=List.of(1,2,3,4,5,6)
		.stream()
		.reduce((i,j) -> (i+j));
		
		System.out.println(op.get());
		
			
	}

}
