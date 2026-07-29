package java_prog.intreface.Rev;

public class Functional_Interface {

	public static void main(String[] args) {

		Car car=new Swift();
		car.run("Top speed..");
	}

}
interface Car
{
	void run(String s);
	
}
class Swift implements Car
{
	public void run(String s)
	{
		System.out.println(s.toUpperCase());
	}

}
