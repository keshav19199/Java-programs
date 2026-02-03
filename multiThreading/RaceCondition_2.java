package java_prog.multiThreading;

public class RaceCondition_2 {

	public static void main(String[] args) throws InterruptedException {

		
		Mobile_1 m1=new Mobile_1();
		
		Hello hello=new Hello(m1);
		Hii hii=new Hii(m1);
		
//		hello.count = m1;
//		hii.count = m1;
		
		hello.start();
		hii.start();
		
		Thread.sleep(400);
		System.out.println(m1.getCount());
		
		
		
		
	}

}
class Mobile_1
{
	int count=0;
	
	public void Increase()
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

class Hello extends Thread
{
	Mobile_1 count;
	
	public Hello(Mobile_1 count)
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
class Hii extends Thread
{
	Mobile_1 count;
	
	Hii(Mobile_1 count)
	{
		this.count=count;
	}
	
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			count.Decrease();
		}
	}
}
