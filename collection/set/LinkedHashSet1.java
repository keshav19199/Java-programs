package java_prog.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(21);
		set.add(56);
		set.add(23);
		set.add(null);
		set.add(43);
		set.add(64);
		set.addFirst(1);
		set.addLast(99);
		
		System.out.println(set);
		
	}

}
