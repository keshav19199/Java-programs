package java_prog.collection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		
		list.add(22);
		list.add(12);
		list.add(432);
		list.add(422);
		list.add(3);
		
		//System.out.println(list);
		
		ListIterator<Integer> itr=list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("**************");
		
		while(itr.hasPrevious())		// it is not first print because firt you can go forward
		{
			System.out.println(itr.previous());
		}
	}

}
