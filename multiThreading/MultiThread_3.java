package java_prog.multiThreading;

public class MultiThread_3 {

	public static void main(String[] args) {

		Thread t=new Thread(()->{
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even: "+i);
			}
	}});
	
	Thread t2=new Thread(()->{
		
		for(int j=1; j<100; j++)
		{
			if(!(j%2==0))
			System.out.println("Odd: "+j);
		}});
	
	
	
	t.start();
	t2.start();
	
	}

}
