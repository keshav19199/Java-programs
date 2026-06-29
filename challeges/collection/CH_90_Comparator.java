package java_prog.challeges.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CH_90_Comparator {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Lion","Tiger","Zebra","Elephant","Rabit");
		System.out.println("Original: "+list);
		sortInDesc(list);
		System.out.println("Sorted :  "+list);
		
	}
	
	public static void sortInDesc(List<String> sList)
	{
		Collections.sort(sList);
	}

}
