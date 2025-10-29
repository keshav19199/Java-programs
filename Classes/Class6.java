package java_prog.Classes;

public class Class6 {

	public static void main(String[] args) {

		Airoplane boing=new Airoplane();
		boing.name="tejas";
		boing.price="23.22 core";
				
		Airoplane air_india=new Airoplane();
		air_india.name="abc.ds";
		air_india.price="435.32 core";
		
		boing.fly();
		air_india.fly();
	}

}
class Airoplane
{
	String name;
	String price;
	
	public void fly()
	{
		System.out.println("Airoplan has started..");
	}
}
