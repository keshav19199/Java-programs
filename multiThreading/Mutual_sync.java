package java_prog.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class Mutual_sync {

	public static void main(String[] args) {

		
		Producer pr=new Producer();
		
		Hell hel=new Hell();
		Hi hi=new Hi();
		
		//		pr.addNum();
		//		pr.removeNum();
		
		hel.p=pr;
		hi.p=pr;
		
		
		hel.start();
		hi.start();	
		
		
		
		
		
		
	}

}
class Producer
{
	List<Integer> list=new ArrayList<Integer>();
	
	int num=1;

	public void addNum() throws InterruptedException
	{
		if(list.size()==10)
		{
			System.out.println("memory are full..");
			wait();
		}
			list.add(num);
			System.out.println("Add : "+num);
			num++;
			
			notify();
		
		
	}
	
	
	public void removeNum() throws InterruptedException
	{
		if(list.size()==0)
		{
			System.out.println("Element not found..");
			wait();
			
		}
			System.out.println();
		
			System.out.println();
			int remove=list.remove(0);
			System.out.println("Remove : "+remove);	
			notify();
	}
}


class Hell extends Thread
{
	Producer p;
	
	public void run()
	{
		while(true) {
		try {
			
			Thread.sleep(1000);
			
		p.addNum();
		}
		catch(Exception e) {
			{
				System.out.println("the add exception generate..");
			}
		}
		}
		
	}
}
class Hi extends Thread
{
	Producer p;
	
	public void run()
	{
		while(true) {
		try {
			
			Thread.sleep(1000);
			
		p.removeNum();
		}
		catch(Exception e)
		{
			System.out.println("the remove exception generate...");
		}
		}
	}

}