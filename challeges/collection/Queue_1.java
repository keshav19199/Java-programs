package java_prog.challeges.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {

	public static void main(String[] args) {

		Queue<Integer> queue=new LinkedList<Integer>();
		
		queue.add(12);
		queue.offer(13);
		
		Utility.print(queue);
		
		System.out.println("Remove: "+queue.remove());
		System.out.println("Hey.."+queue.peek());
		System.out.println("Element: "+queue.element());
		System.out.println("Poll: "+queue.poll());
		
		System.out.println();
		Utility.print(queue);
		System.out.println("Poll: "+queue.poll());

		

	}

}
