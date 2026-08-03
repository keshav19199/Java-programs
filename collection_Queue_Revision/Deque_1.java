package java_prog.collection_Queue_Revision;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_1 {

	public static void main(String[] args) {

		Deque<Integer> de=new ArrayDeque<Integer>();
		
		de.add(12);
		de.add(13);
		de.add(76);
		de.add(43);
		de.add(19);
		
		System.out.println(de);
		
		System.out.println(de.peek());	// peek is seeing first element
		
		System.out.println(de.removeLast());
		System.out.println(de.removeFirst());
		
		de.addFirst(9090);
		de.addLast(9090);
		
		System.out.println(de);
	}

}
