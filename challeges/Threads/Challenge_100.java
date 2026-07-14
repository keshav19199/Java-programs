package java_prog.challeges.Threads;

public class Challenge_100 {

	public static void main(String[] args)throws InterruptedException {

		ThreadState t1=new ThreadState();
		
		System.out.println("Start: "+t1.getState());
		t1.start();
		t1.join();
		
		System.out.println("Finish: "+t1.getState());
	}
}

class ThreadState extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(3000);
			
			System.out.println("From inside: "+getState());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
