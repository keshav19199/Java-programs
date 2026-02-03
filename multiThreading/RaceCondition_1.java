package java_prog.multiThreading;

public class RaceCondition_1 {

	public static void main(String[] args) {

		One_1 on=new One_1();
		Two_2 to=new Two_2();
		
		on.start();
		to.start();
		
		System.out.println();
		
		
	}
}
class Plus
{
	int count=0;
	public void Add()
	{
		this.count++;
	}
	public void run()
	{}

}
class One_1 extends Thread
{
	Plus count;
	public void run() {
	for(int i=0; i<100; i++)
	{
		count.Add();
	}
	}
}
class Two_2 extends Thread
{
	Plus count;
	
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			count.Add();
			
		}
	}

}