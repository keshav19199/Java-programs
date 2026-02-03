package java_prog.multiThreading;

public class Syncronized_1 {

	public static void main(String[] args) throws InterruptedException {

		Counter c1=new Counter();
		Counter c2=new Counter();
		
		One on=new One(c1);
		Two to=new Two(c1);
//		 on.count=c1;
//		 to.count=c1;
//		
		 
		 on.start();
		 to.start();
		 
		 Thread.sleep(100);
		 
		 System.out.println(c1.getCount());
		 System.out.println(c2.getCount());
		 
	
		
	}

}
class Counter
{
	int count=0;
	
	public synchronized void Increase()
	{
		this.count++;
	}
	
	public void Decrease()
	{
		this.count--;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	

}
class One extends Thread
{
	Counter count;
	
	public One(Counter count)
	{
		this.count=count;
	}
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			count.Increase();
		}
	}

}
class Two extends Thread
{
	Counter count;
	
	public Two(Counter count)
	{
		this.count=count;
	}
	
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			count.Decrease();
		}
	}
	
}
