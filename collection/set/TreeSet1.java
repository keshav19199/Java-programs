package java_prog.collection.set;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(11);
		set.add(32);
		set.add(64);
		set.add(32);
		set.add(54);
		
		System.out.println(set);
	}

}
