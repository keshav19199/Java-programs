package java_prog.collection_Revision;

import java.util.LinkedList;

public class Linkeld_List {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<Integer>();
		
		
		for(int i=0; i<100000; i++)
		{
			list.add(i);
		}
		//list.add(2, 655);
		
		long start=System.nanoTime();		
		list.remove(2);
		
		long end=System.nanoTime();
		
		System.out.println(list);
		System.out.println("Time: "+(end-start)/1000);
		
	}

}
