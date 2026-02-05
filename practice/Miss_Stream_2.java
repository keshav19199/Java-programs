package java_prog.practice;

import java.util.List;
import java.util.stream.IntStream;

public class Miss_Stream_2 {

	public static void main(String[] args) {

		List<Integer> list=List.of(10,21,15);
		
		IntStream.range(10, 25)
		.forEach((i) -> {
			if(! list.contains(i))
			{
				System.out.println(i);
			}
		});
	}

}
