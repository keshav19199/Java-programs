package java_prog.intreface;

public class Interface1 {

	public static void main(String[] args) {

		AA a=new AA();
		a.run();
		
		
		
		Idemo d=new Idemo()		//Anonymous class.
				{
					public void run()
					{
						System.out.println("Running..");
					}
			
				};
		
		d.run();
	}

}
interface Idemo
{
	void run();
}
interface Idemo2
{
	void run();
}


class AA implements Idemo, Idemo2
{
	public void run()
	{
		System.out.println("Helloo..");
	}
}