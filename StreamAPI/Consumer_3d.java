package java_prog.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_3d {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(10,20,30);
		List<Integer> list2=Arrays.asList(40,50,60);
		List<Integer> list3=Arrays.asList(11,22,33);
		List<Integer> list4=Arrays.asList(3,4,5,6);
		
		List<List<Integer>> list5=new ArrayList<List<Integer>>();
		list5.add(list);
		list5.add(list2);
		list5.add(list3);
		list5.add(list4);
		
		
		List<List<List<Integer>>> list6=new ArrayList<List<List<Integer>>>();
		list6.add(list5);
			
		System.out.println(list6);
		
		Consumer_c3 con3=new Consumer_c3();
		con3.accept(list6);
		
		
		
	}

}
class Consumer_c1 implements Consumer<List<Integer>>
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
class Consumer_c2 implements Consumer<List<List<Integer>>>
{
	public void accept(List<List<Integer>> t)
	{
		for(List<Integer> list: t)
		{
			Consumer_c1 con=new Consumer_c1();
			con.accept(list);
		}
	}
	
}
class Consumer_c3 implements Consumer<List<List<List<Integer>>>>
{
	public void accept(List<List<List<Integer>>> t)
	{
		for(List<List<Integer>> list4:t)
		{
			Consumer_c2 con2=new Consumer_c2();
			con2.accept(list4);
			
		}
	}
	
}