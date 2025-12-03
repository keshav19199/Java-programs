// Print the missing elements of given numberline.
// 12,14,15,18,19,22.

package java_prog.collection;

import java.util.List;
import java.util.ArrayList;

public class Logical1 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(14);
		list.add(15);
		list.add(18);
		list.add(19);
		list.add(22);
		
		int num=list.getFirst();
		
		for(int i=list.getFirst(); i<=list.getLast(); i++)
		{
			if(list.contains(num)==false)
			{
				
				System.out.println(num);
			}
			num++;
		}
		System.out.println(list);

		
	}

}
