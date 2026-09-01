package java_prog.multiTreading.Revision;

public class EvenOddSeparateThread {

	public static void main(String[] args) {

		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
				
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%2==0)
			{
				System.out.println("Even: "+i);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
	}
}

