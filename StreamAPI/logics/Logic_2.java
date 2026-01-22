package java_prog.StreamAPI.logics;

import java.util.List;
import java.util.stream.IntStream;

public class Logic_2 {
	public static void main(String args[]){
		
		List<Integer> list=List.of(10,13,17,20);
		
		IntStream.rangeClosed(10, 20)
		.forEach((i) -> {
			if(!list.contains(i))
				{
					System.out.println(i);
				}
			});
	}

}
