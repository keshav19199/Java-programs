package java_prog.collection_Logical;

import java.util.ArrayList;

public class Missing_num {

	public static void main(String[] args) {

		int arr[]= {1,3,7,4,9};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i:arr)
		{
			list.add(i);
		}
		System.out.println(list);
		// first find large and small element, but i;m direct 
		
		for(int i=1; i<=9; i++)
		{
			if(list.contains(i))
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
	}

}
