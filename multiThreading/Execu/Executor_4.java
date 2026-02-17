package java_prog.multiThreading.Execu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_4 {

	public static void main(String[] args) {

		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		Runnable ru=()->{
			
			int sum=0;
			for(int i=0; i<10;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		};
		
		Runnable ruru=()->{
			int mult=1; 
			for(int i=1; i<10; i++) 
			{
				mult=mult*i;
			}
			System.out.println(mult);};
		
		Future<?> ftt=ex.submit(ru,"dii");
		Future<?> ft=ex.submit(ruru,"diiddii");
		
		try {
		System.out.println(ftt.get());
		System.out.println(ft.get());
		}
		catch(Exception e){}
		
		ex.shutdown();
	}

}
