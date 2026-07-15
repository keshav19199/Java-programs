package java_prog.challeges.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge_103 {

	public static void main(String[] args) {

		// print the 1 to 10 number using single thread
		
		try (ExecutorService service=Executors.newSingleThreadExecutor())
		{		
		PrintNum p1=new PrintNum();
		
		service.submit(p1);
		}
	}

}
class PrintNum implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Number is "+(i+1));
		}
	}
}
