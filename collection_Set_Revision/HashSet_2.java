package java_prog.collection_Set_Revision;

import java.util.HashSet;
import java.util.Set;

public class HashSet_2 {

	public static void main(String[] args) {

		int arr[]= {12,12,23,45,32,12,54,34,34,44,65,65};
		
		System.out.println(arr);
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i:arr)
		{
			set.add(i);
		}
		System.out.println(set);
	}

}
