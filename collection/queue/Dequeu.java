package java_prog.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeu {

	public static void main(String[] args) {

		Deque<Integer> d=new ArrayDeque<Integer>();
		d.add(23);
		d.add(54);
		d.add(75);
		
		System.out.println(d);
		
		System.out.println(d.poll());
	}

}
