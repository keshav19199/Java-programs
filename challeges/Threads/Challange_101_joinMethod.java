package java_prog.challeges.Threads;

public class Challange_101_joinMethod {

	public static void main(String[] args)throws InterruptedException {

		Tstate t1=new Tstate(1);
		Tstate t2=new Tstate(2);
		Tstate t3=new Tstate(3);
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t2.join();
			
		
	}

}
class Tstate extends Thread
{
	int num;
	public Tstate(int num)
	{
		this.num=num;
	}
	
	public void run()
	{
		System.out.println("Start: "+Thread.currentThread().getName());
		
		try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error Occured"+e.getMessage());
		}
		
		System.out.println("Finish: "+Thread.currentThread().getName());
	}
	
}
