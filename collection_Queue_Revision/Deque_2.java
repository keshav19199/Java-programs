package java_prog.collection_Queue_Revision;

import java.util.LinkedList;

public class Deque_2 {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<Integer>();
		

		for(int i=0; i<100000; i++)
		{
			list.add(i);
		}
		
		long s=System.nanoTime();		
		System.out.println(list.get(50000));
		long e=System.nanoTime();
		
		System.out.println((e-s)/10000);
	}

}
