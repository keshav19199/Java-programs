package java_prog.StreamAPI.logics;

import java.util.List;

public class Second_Higest {

	public static void main(String[] args) {

		 // 1,2.3rd highest with remove duplicate
		
		List.of(12,23,65,32,87,5,89,65,43,5,87,65)
		.stream()
		.sorted()
		.distinct()
		.limit(3)
		.skip(0)
		.forEach((i)->{System.out.println(i);});
	}

}
