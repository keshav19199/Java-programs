package java_prog.challeges.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_1 {

	public static void main(String[] args) {

		ExecutorService service=Executors.newSingleThreadExecutor();
		
		Print p=new Print("*");
		
		service.submit(p);
		service.submit(p);
		service.submit(p);
		
		service.shutdown();
		
	}
}
class Print implements Runnable
{
	String s;
	public Print(String s)
	{
		this.s=s;
	}
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.print(i+" ");
		}
	}
}
