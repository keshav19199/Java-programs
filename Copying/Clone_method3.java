package java_prog.Copying;

public class Clone_method3 {
	public static void main(String[] args) throws Exception {

		Bike bike=new Bike(150);
		
		Bike bike2=(Bike)bike.Clone();
		
		System.out.println(bike.cc);
		System.out.println(bike2.cc);
	}

}
class Bike implements Cloneable
{
	int cc;
	
	public Bike(int cc) throws Exception
	{
		if(cc<125)
		{
			throw new Exception("Not a real bike");
		}
		this.cc=cc;
		
		System.out.println("OBJ Created..");
	}
	
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}

