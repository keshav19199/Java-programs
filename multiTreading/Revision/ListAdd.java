package java_prog.multiTreading.Revision;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello");
		List<Integer> list=new ArrayList<Integer>();
		First1 f=new First1(list);
		Second s=new Second(list);
		
		f.start();
		s.start();
		f.join();
		s.join();
		
		System.out.println(list.size());
				
		
	}
}
class First1 extends Thread
{
	List<Integer> list;
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			list.add(i);
		}
	}
	public First1(List<Integer> list) {
		super();
		this.list = list;
	}
	
}
class Second extends Thread
{
	List<Integer> list;
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			list.add(i);
		}
	}
	public Second(List<Integer> list) {
		super();
		this.list = list;
	}
	
	
}