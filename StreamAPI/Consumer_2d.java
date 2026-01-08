package java_prog.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_2d {

	public static void main(String[] args) {

		List<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(32);
	
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(54);
		list2.add(25);
		
		List<List<Integer>> list3=new ArrayList<List<Integer>>();
		list3.add(list1);
		list3.add(list2);
		
		System.out.println(list3);
		
		Two_c two=new Two_c();
		two.accept(list3);
	}
}
class First_c implements Consumer<List<Integer>>
{
	public void accept(List<Integer> t)
	{
		int sum=0;
		for(int i: t)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}

class Two_c implements Consumer<List<List<Integer>>>
{
	public void accept(List<List<Integer>> t)
	{
		for(List<Integer> list:t)
		{
			First_c first=new First_c();
			first.accept(list);
		}
	}
}
	