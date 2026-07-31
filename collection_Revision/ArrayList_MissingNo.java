package java_prog.collection_Revision;

import java.util.List;

public class ArrayList_MissingNo {

	public static void main(String[] args) {

		// List<Integer> list=List.of(12,23,65,23,13,76,34,87,99);
		
		List<Integer> list=List.of(1,4,2,9,6);

		int num=0;
		int num2=1000;
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)>num)
			{
				num=list.get(i);
			}
			if(list.get(i)<num2)
			{
				num2=list.get(i);
			}
			
		}
			System.out.println("higest: "+num);
			System.out.println("lowest: "+num2);
		
		for(int i=1; i<9; i++)	
		{
			if(list.contains(i)==false)
			{
			System.out.println(i);	
			}
		}
	}

}
