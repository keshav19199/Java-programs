package java_prog.Classes;

public class Input_Parameter {

	public static void main(String[] args) {

		Railway rail=new Railway();
		rail.add(30,20);
		rail.add(100,900);
		
		Railway rail2=new Railway();
		rail2.div(90,30);
		rail2.multi(4,3);
		
	}

}
class Railway
{
	//method parameter.
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void div(int i, int j)
	{
		System.out.println("Division: "+ i/j);	
	}
	public void multi(int i,int j)
	{
		System.out.println("Multiplication: "+i*j);
	}

}
