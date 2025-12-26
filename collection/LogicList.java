package java_prog.collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LogicList {

	public static void main(String[] args) {

		List<Integer> list=new LinkedList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		list.add(21);
		list.add(21);
		list.add(56);
		list.add(654);
		list.add(32);
		list.add(897);
		list.add(12);
		list.add(324);
		list.add(23);
		
		
		System.out.println(list);
		
		for(Integer a : list)
		{
			if(a !=null && a.toString().startsWith("2"))
			{
				list2.add(a);
			}
		}
		System.out.println(list2);
		
	}

}
