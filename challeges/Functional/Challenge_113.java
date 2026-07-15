package java_prog.challeges.Functional;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge_113 {

	public static void main(String[] args) {

		List<Integer> list=List.of(1,2,3,4,5,67,65,43,2,3,4,2);
		
		
		List<Integer> result= list.stream()
		.distinct()
		.collect(Collectors.toList());	
		
		System.out.println("Original: "+list);
		System.out.println("Result: "+result);
	}

}
