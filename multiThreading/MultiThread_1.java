package java_prog.multiThreading;

public class MultiThread_1 {

	public static void main(String[] args) throws Exception {

		Numbers num=new Numbers();
		
		num.start();
		
		
		int count=1;
		while(count<=10)
		{
			Thread.sleep(100);
			System.out.println("Hii..");
			count++;
		}
		
	}

}
class Numbers extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			try{
				{
			}
				Thread.sleep(100);
				System.out.println("Even: "+i);
			}
			catch(Exception e)
			{
				System.out.println("Get Exception..");
			} }
			
		}
		
	}

