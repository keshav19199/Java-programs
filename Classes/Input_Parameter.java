package java_prog.Classes;

public class Input_Parameter {

	public static void main(String[] args) {

		Railway rail=new Railway();
		rail.add(30,20);
		
		Railway rail2=new Railway();
		rail.add(100,900);
		
	}

}
class Railway
{
	//method parameter.
	public void add(int i, int j)
	{
		System.out.println(i+j);	
	}

}
