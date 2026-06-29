package java_prog.challeges.collection;

import java.util.Arrays;
import java.util.List;

public class CH_92_Swapping {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(12,76,32,98,23,65,92,13,36);
		
		System.out.println("array"+list);
		swap(list,1,8);
		System.out.println("Swap "+list);
		
	}
	public static void swap(List<Integer> list,int x, int y)
	{
		int swap=list.get(x);
		list.set(x, list.get(y));
		list.set(y, swap);
	}
	

}
