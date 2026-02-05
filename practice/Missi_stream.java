package java_prog.practice;

import java.util.List;
import java.util.stream.IntStream;

public class Missi_stream {

	public static void main(String[] args) {

		List<Integer> list=List.of(11,13,16,19);
		
		IntStream.range(10, 20)
		.forEach((i) -> {
			if(! list.contains(i))
			{
				System.out.println(i);
			}
		});
	}

}
