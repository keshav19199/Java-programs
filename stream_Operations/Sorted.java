package java_prog.stream_Operations;

import java.util.List;

public class Sorted {

	public static void main(String[] args) {

		System.out.print("Ascending order: ");
		List.of(32,45,67,34,12,232,12,43)
		.stream()
		.sorted((i,j)->{return Integer.compare(i, j);})
		.forEach((i)->{System.out.print(" "+i);});
		
		//sorted in ascending order
		System.out.println();
		System.out.println("****************************************");
		
		System.out.print("Descending order: ");
		List.of(32,45,67,34,12,232,12,43)
		.stream()
		.sorted((i,j)->{return Integer.compare(j,i);})
		.forEach((i)->{System.out.print(" "+i);});
		
		// in descending order
		
		
		
	}

}
