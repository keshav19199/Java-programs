package java_prog.collection_List_Revision;

import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {

		Vector<Integer> vac=new Vector();
		
		for(int i=0;i<10; i++)
		{
			vac.add(i);
		}
		
		System.out.println(vac);
		
		System.out.println(vac.reversed());
	}

}
