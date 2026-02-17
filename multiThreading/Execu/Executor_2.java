package java_prog.multiThreading.Execu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		try		// try with resource
		
		(ExecutorService es=Executors.newSingleThreadExecutor();)
		{

		Runnable ru=()->{
			for(int i=0; i<10; i++)
			{
				System.out.println(i);
			}
		};
		
		
		
		Future<?> ft=es.submit(ru,"defalt val");
		
		System.out.println(ft.get());
		
	}
	}

}
