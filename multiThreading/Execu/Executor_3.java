package java_prog.multiThreading.Execu;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_3 {

	public static void main(String[] args) throws Exception{

		ExecutorService excu=Executors.newSingleThreadExecutor();
		
		Callable<Integer> call=()->{ return 123;};
		
		Future<Integer> fut=excu.submit(call);
		
		System.out.println(fut.get());
		
		excu.shutdown();
	}

}
