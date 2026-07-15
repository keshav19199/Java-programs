package java_prog.challeges.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Challenge_104 {

	public static void main(String[] args) {
		
		try (ExecutorService service=Executors.newFixedThreadPool(3)){
		
		for(int i=0; i<10; i++)
		{
			Sleep s=new Sleep();
			service.submit(s);
		}
		service.shutdown();
		
		if(! service.awaitTermination(10, TimeUnit.SECONDS))
		{
			System.out.println("EMERGENCY SHUTDOWN");
			service.shutdown();
		}
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		
	}
}
class Sleep implements Runnable
{
	public void run()
	{
		Thread current=Thread.currentThread();
		System.out.println("Started Thread: "+ current.getName());
		
		try {
			Thread.sleep(getRandom()*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End Thread: "+ current.getName());

	}
	
	private int getRandom()
	{
		double random=Math.random()*5+1;
		return (int)random;
	}
}
