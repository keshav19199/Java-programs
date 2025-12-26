// print the elements to list in a start index is one
// list is {111,2341,1011,7761,999,null, 6679,143,6922}
package java_prog.Logoical;

import java.util.List;
import java.util.Collection;
import java.util.LinkedList;

public class IndexWith1 {

	public static void main(String[] args) {

		List<Integer> list=new LinkedList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		
		list.add(111);
		list.add(2341);
		list.add(1011);
		list.add(7761);
		list.add(999);
		list.add(null);
		list.add(6679);
		list.add(143);
		list.add(6922);
		list.add(1);
		list.add(1);
		
		
		System.out.println(list);
		
		for(Integer v : list)
		{
			if(v !=null && v.toString().startsWith("1"))
			{
				list2.add(v);
			}
		}
		
		System.out.println(list2);
	}

}
