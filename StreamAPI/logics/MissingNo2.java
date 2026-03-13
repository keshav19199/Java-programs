package java_prog.StreamAPI.logics;

import java.util.List;
import java.util.stream.IntStream;

public class MissingNo2 {

	public static void main(String[] args) {

		List<Integer> list=List.of(3,6,4,2,8);
		
		IntStream.range(1, 10).forEach((i)-> {if(!list.contains(i))
			{
			System.out.println(i);
			}});
	}

}
