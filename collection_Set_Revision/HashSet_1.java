package java_prog.collection_Set_Revision;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList();
		
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(15);
		list.add(15);
		list.add(16);
		list.add(11);
		list.add(18);
		
		System.out.println(list);
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.addAll(list);
		
		System.out.println(set); 	// hashset not allow duplicate value
		
	}
}
