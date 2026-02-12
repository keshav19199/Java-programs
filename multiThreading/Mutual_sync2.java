package java_prog.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class Mutual_sync2 {

	public static void main(String[] args) {

		Source_1 sour=new Source_1();
//		Thread t1=new Thread();
//		Thread t2=new Thread();
		
		
		Prod p1=new Prod();
		p1.start();
		
//		t1.start();
//		t2.start();
		
		
		
		
		
	}

}

class Source_1
{
	List<Integer> list=new ArrayList<Integer>();
	
	public void add()
	{
		int num=1;
		if(list.size()==10)
		{
			System.out.println("FUULLL...");
		}
		else {
			
			list.add(num);
			System.out.println("Add : "+num);
			num++;
		}
	}
	
	
	
	public void remove()
	{
		int remove=1;
		
		if(list.size()==0)
		{
			System.out.println("element not found..");
		}
		else {
			
			remove=list.remove(0);
			System.out.println("Remove : "+remove);
			
		}
	}

}
class Prod extends Thread
{
	 Source_1 s;
	 
	public void run()
	{
		while(true)
		{
			try {
			s.add();
			}
			catch (Exception e){
				
			}
		}
	}

}
