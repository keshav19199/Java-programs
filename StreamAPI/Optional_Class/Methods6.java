package java_prog.StreamAPI.Optional_Class;

import java.util.List;
import java.util.Optional;

public class Methods6 {

	public static void main(String[] args) {

		Optional<Integer> op=List.of(23,43,54,65,76,87,65,80,90)
				.stream()
				.max((i,j) -> (Integer.compare(i, j)));
		
		System.out.println("Max: "+op.get());
		
	}

}
