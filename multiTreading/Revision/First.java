package java_prog.multiTreading.Revision;

public class First {

	public static void main(String[] args) {

		One o=new One();
		Two t=new Two();
		Two t2=new Two();
		Two t3=new Two();
		
		o.start();
		t.start();
//		t2.start();
//		t3.start();
		
	}

}
class One extends Thread
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			try {
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Zoplaaa");
				}
			System.out.println("*************");
		}
		
	}
	
}
class Two extends Thread
{
	public void run()
	{
		int i=0;
		while(i<100)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#");
			i ++;
		}
	}
}
