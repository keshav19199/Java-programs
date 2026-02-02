package java_prog.multiTreading;

public class Firzt {

	public static void main(String[] args) throws InterruptedException {

		NumPrint np=new NumPrint();
		NumPrint np2=new NumPrint();
		NumPrint np3=new NumPrint();

		
		np.start();
		np2.start();
		np3.start();
		
		
		int count=1;
		while(count<10)
		{
			Thread.sleep(100);
			System.out.println("Hello..");
			count++;
		}
		
	}

}

class NumPrint extends Thread
{
	public void run()
	{
		try {
		for(int i = 1; i<10;i++)
		{
			Thread.sleep(100);
			System.out.println(i);
		}
	}
		catch(Exception ex)
		{
			System.out.println("Throw Exception...!");
		}
	}
	
}