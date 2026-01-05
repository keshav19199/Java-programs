package java_prog.collection.iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class Iterator1 {

	public static void main(String[] args) {

		Stack<Integer> coll=new Stack<>();
		
		coll.add(21);
		coll.add(342);
		coll.add(34);
		coll.add(65);
		
		Iterator<Integer> itr=coll.iterator();	//it is used in proper LIFO
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			coll.remove(1);
			System.out.println(coll);
		
		System.out.println(coll.pop());	// remove LIFO.
		
		
	}

}
