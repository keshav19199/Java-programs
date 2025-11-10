package java_prog.abstraction;

public class Interface {

	public static void main(String[] args) {

		Ianimal ian=new Lion();
		Ianimal ia=new Lion();
		
		
	}

}


interface Idrink
{
	int drink(String str);
}



interface Ianimal
{
	void sleep(int i);
	
	void sleep(int i, int j);
	
	void run(String str);
	
	void hunt(String str);
}
class Lion implements Ianimal, Idrink
{
	public void sleep(int i)
	{
		
	}
	public void sleep(int i, int j)
	{
		
	}
	public void run(String str)
	{
		
	}
	public void hunt(String str)
	{
		
	}
	@Override
	public int drink(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
}
