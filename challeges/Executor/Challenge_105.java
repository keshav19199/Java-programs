package java_prog.challeges.Executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Challenge_105 {

	public static void main(String[] args) throws InterruptedException {
		
	try(ExecutorService service=Executors.newFixedThreadPool(3)){
		
		List<Future<Integer>> list=new ArrayList<>();
		
		for(int i=0; i<10; i++)
		{
			Factorial f1=new Factorial(i);
			list.add(service.submit(f1));
		}
		
		for(Future<Integer> future: list)
		{
			System.out.println("Result is: "+future.get());
		}
		service.shutdown();
		
		if(service.awaitTermination(5, TimeUnit.SECONDS))
		{
			System.out.println("Bhohot Huaa Bus..");
		}
	}
	catch(Exception e)
	{
		System.out.println("Error generate..");
	}

	}
}
class Factorial implements Callable<Integer>
{
	int number;
	
	public Factorial(int number)
	{
		this.number=number;
	}
	
	@Override
	public Integer call() throws Exception {

		Thread.sleep(2000);
		if(number<=1)
		{
			return 1;
		}
		int result=1;
		
		for(int i=2; i<=number; i++)
		{
			result *=i;
		}
		return result;
	}
}
