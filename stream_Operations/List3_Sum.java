package java_prog.stream_Operations;

import java.util.List;

public class List3_Sum {

	public static void main(String[] args) {

		List<Integer> list=List.of(13,23,12,43,65,43,12,21,22,44);
		
		//print the sum number
		
		list.stream().filter((i)->{return i%2==0;})
		.forEach((hell)->{System.out.println(hell);});
	}

}
