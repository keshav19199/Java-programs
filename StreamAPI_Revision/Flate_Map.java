package java_prog.StreamAPI_Revision;

import java.util.List;

public class Flate_Map {

	public static void main(String[] args) {

		int sum=List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9))
		.stream()
		.flatMap((i)->(i.stream()))	//flat map use for collect the stream
		.reduce(0,(i,j)->(i+j));
		
		System.out.println(sum);
	}

}
