package java_prog.challeges.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CH_93_Reverce {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,98);
		
		System.out.println("Array: "+list);
		
		Collections.reverse(list);
		
		System.out.println("Reverce: "+list);
	}

}
