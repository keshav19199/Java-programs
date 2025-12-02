package java_prog.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {

		List<Integer> arr=new ArrayList<Integer>();
		
		System.out.println(arr.add(23));
		arr.add(34);
		arr.add(11);
		arr.add(null);
		System.out.println(arr.get(3));
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		
		System.out.println(arr.remove(2));
		System.out.println(arr.remove(null));
	}

}
