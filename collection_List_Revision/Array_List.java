package java_prog.collection_List_Revision;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		for(int i=0;i<10000; i++)
		{
			list.add(i);
		}
		long start=System.nanoTime();
		
		list.remove(120);
		System.out.println(list.contains(1232));	//element exit or not
		
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		long end=System.nanoTime();
		
		System.out.println("Time: "+(end-start)/100000);
	}

}
