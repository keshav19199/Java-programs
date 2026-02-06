package java_prog.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class Mutual_sync {

	public static void main(String[] args) {

		
		Producer pr=new Producer();
		
		pr.removeNum();
		pr.addNum();
		
		
		
		
		
		
	}

}
class Producer
{
	List<Integer> list=new ArrayList<Integer>();
	
	public void addNum()
	{
		int num=1;
		while(list.size()<10)
		{
			list.add(num);
			System.out.println("Add : "+num);
			num++;
		}
		
	}
	
	
	public void removeNum()
	{
		if(list.size()==0)
		{
			System.out.println("Element not found..");
			System.out.println();
		}
		
		
		else
		{
			System.out.println();
			int remove=list.remove(0);
			System.out.println("Remove : "+remove);
		}		
	}
}


class Hell extends Thread
{
	Producer p;
	
	public void run()
	{
		
		
	}

}
