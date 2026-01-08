package java_prog.collection.queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_Array_List {

	public static void main(String[] args) {

		LinkedList<Integer> link=new LinkedList<Integer>();	
		
		ArrayList<Integer> link2=new ArrayList<Integer>(); 	
		
		for(int i=0; i<50000000; i++)
		{
			link.add(i);
		}
		long StartTime= System.nanoTime();
		  System.out.println(link.get(43));
		  //link= 43999999-> 58590,61734,49909
		  //		43-> 1135,933
		  // link2= 43999999->330,441,356
		  //	43 ->426,354,450
		long EndTime= System.nanoTime();
		
		System.out.println((EndTime-StartTime)/1000);
		
		
	}

}
