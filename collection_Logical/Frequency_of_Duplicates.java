package java_prog.collection_Logical;

import java.util.ArrayList;

public class Frequency_of_Duplicates {

	public static void main(String[] args) {

		int arr[]= {11,12,13,11,12,1,1,1,1,1,1,11,15,16,43,43,334,54,35,6};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i:arr)
		{
			list.add(i);
		}
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		{
			int num=list.get(i);
			int count=0;
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(j)==num)
				{
					count++;
				}
			}
			System.out.println(num+" : "+count);
		}
	}

}
