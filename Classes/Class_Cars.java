package java_prog.Classes;

public class Class_Cars {

	public static void main(String[] args) {
		
		
		Cars booking=new Cars();
		
		booking.name="Honda";
		booking.type="Four Wheeler";
		booking.price=5434354;
		booking.car();
		
		booking.name="Verna";
		booking.type="Long length";
		booking.price=650000;
		booking.car();

		
	}

}

class Cars{
	
	String name;
	String type;
	int price;
	
	public void car()
	{
		String str="Welcom to my family..";
		System.out.println(str);

		System.out.println("My car name: "+name);
		System.out.println("car Type: "+type);
		System.out.println("car Price: "+price);
		System.out.println();
	
	}
}
