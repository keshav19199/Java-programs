// print the missing numbers.

//9,2,4,8,3,6.

package java_prog.collection;

import java.util.List;
import java.util.ArrayList;

public class Logical {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(9);
		list.add(9);

		int num=list.getFirst();
		
		for(int i=list.getFirst(); i<list.getLast(); i++)
		{
			if(list.contains(num)==false)
			{
				System.out.println(num);
			}
			num++;
		}

	}

}
