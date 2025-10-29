package java_prog.inheritance;

public class SingleLevel {

	public static void main(String[] args) {

		Tiger shera=new Tiger();
		shera.hunt();
		shera.rore();
		System.out.println(shera.teeth);
		
		Lion Rubi=new Lion();
		Rubi.hunt();
		Rubi.rore();
		System.out.println(Rubi.teeth);
		System.out.println(Rubi.hunt);
		
	}

}
class Maunsari
{
	String teeth="large";
	
	public void hunt()
	{
		System.out.println("I am hunting..");
	}
	
	public void rore()
	{
		System.out.println("I am roaring..");

	}
}

class Tiger extends Maunsari
{
	
}

class Lion extends Maunsari
{
	int hunt=34;
}