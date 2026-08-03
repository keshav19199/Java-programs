package java_prog.collection_Logical;

import java.util.HashSet;
import java.util.TreeSet;

public class Unique_Elements {

	public static void main(String[] args) {

		int[] arr= {12,12,11,13,11,13,13,43,546,7,45,45,54,45,54,43,76};
		
		//HashSet<Integer> set=new HashSet<Integer>();  it gives unique 
		
		TreeSet<Integer> set=new TreeSet<Integer>();// and treSet gives unique+Sort
		
		for(int i:arr)
		{
			set.add(i);
		}
		System.out.println(set);
	}

}
