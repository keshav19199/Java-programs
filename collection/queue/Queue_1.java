package java_prog.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_1 {
	public static void main(String[] args) {
		
		Queue<Integer> q=new ArrayDeque<Integer>();
		q.add(12);
		q.add(13);
		q.add(64);
		
		q.offer(433);
	
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

}
