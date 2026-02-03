package java_prog.multiThreading;

public class RaceCondition_1 {

	public static void main(String[] args) throws Exception {

		Plus p1=new Plus();
		Plus p2=new Plus();
		
		One_1 on=new One_1(p1);
		Two_2 to=new Two_2(p1);
		
		on.start();
		to.start();
		
		Thread.sleep(1000);
		
		System.out.println(p1.getCout());
		//System.out.println(p2.getCout());
		
		
	}
}
class Plus
{
	int count=0;
	public void Incre()
	{
		this.count++;
	}
	public void Decre()
	{
		this.count--;
	}
	
	public int getCout()
	{
		return this.count;
	}
	

}
class One_1 extends Thread
{
	Plus count;
	
	public One_1(Plus count)
	{
		this.count=count;
	}
	
	public void run() 
	{
		for(int i=0; i<1000; i++)
		{
			count.Incre();
		}
	}
}
class Two_2 extends Thread
{
	Plus count;

	public Two_2(Plus count)
	{
		this.count=count;
	}
	
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			count.Decre();
			
		}
	}

}