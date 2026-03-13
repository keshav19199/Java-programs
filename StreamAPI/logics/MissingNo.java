package java_prog.StreamAPI.logics;

import java.util.List;
import java.util.stream.IntStream;

public class MissingNo {

	public static void main(String[] args) {

		List<Integer> list=List.of(11,14,16,20);
		
		IntStream.rangeClosed(10, 20)
		.forEach((i)-> {if(!list.contains(i))
				System.out.println(i);});
	}

}
