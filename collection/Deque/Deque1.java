package java_prog.collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {

		Deque<Integer> map=new ArrayDeque<Integer>();
		
		map.add(53);
		map.add(12);
		map.add(32);
		map.add(87);
		
		
		//map.peek();
//		map.poll();
//		map.pop();
		System.out.println(map);
	}

}
