package java_prog.challeges.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CH_91_Frequency {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,1,2,1,3,4,5,6,76,7,6,6,5,3,5);
		
		System.out.println(Collections.frequency(list,1));
		System.out.println(Collections.frequency(list,2));
		System.out.println(Collections.frequency(list, 6));
	}

}
