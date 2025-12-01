package java_prog.collection;

import java.util.List;
import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		
		System.out.println(list.add("qwerty"));
		
		
		System.out.println(list);
		System.out.println(list.addAll(list));
	}

}
