package java_prog.inheritance;

public class SingleLevel2 {

	public static void main(String[] args) {

		Bike bike=new Bike();
		bike.rider();
		System.out.println(bike.name);
		System.out.println(bike.no);
		
		Bike Ghoda=new Bike();
		bike.rider();
		System.out.println(bike.name);
		System.out.println(bike.no);
		
	}

}
class Bike
{
	String name="GT650";
	int no=1919;
	
	public void rider()
	{
		System.out.println("Am a rider..");
	}
}
class Ghoda extends Bike
{
	
}