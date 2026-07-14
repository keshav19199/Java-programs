package java_prog.challeges.Threads;

public class Challenge_102 {

	public static void main(String[] args) throws InterruptedException {

		TraficLight t1=new TraficLight(Color.Red);
		TraficLight t2=new TraficLight(Color.Yellow);
		TraficLight t3=new TraficLight(Color.Green);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
	}

}
class TraficLight extends Thread
{
	private final Color color;
	
	public TraficLight(Color color)
	{
		this.color=color;
	}
	
	public void run()
	{
		System.out.println("Active: "+color);
		try {			
			Thread.sleep(color.getTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End: "+color);
	}
}
