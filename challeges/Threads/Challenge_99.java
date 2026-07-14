package java_prog.challeges.Threads;

public class Challenge_99 {

	public static void main(String[] args) {

		Hello one=new Hello(1);
		Hello two=new Hello(2);
		
		one.start();
		two.start();
	}
}
class Hello extends Thread
{
	int num;
	 
	public Hello(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i+" : Hello Thread--"+num);
		}
	}

}
