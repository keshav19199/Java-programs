package java_prog.multiThreading;

public class MultiThread_2 {

	public static void main(String[] args) throws Exception {

		Mobile m=new Mobile();
		
		m.start();
		
		for(int i=0; i<10; i++)
		{
			Thread.sleep(1000);
			if(i%2==0)
			{
				System.out.println("even :"+i);
			}
		}
	}
}

class Mobile extends Thread
{
	public void run()
	{
		
		for(int i=1; i<10; i++)
		{
			try {
			if(!(i%2==0))
			{
				Thread.sleep(1000);
				System.out.println(i+"  :odd");
			}}
			catch(Exception e)
			{
				System.out.println("exception");
			}
	
		}
	}
}
