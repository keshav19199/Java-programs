package java_prog.Classes;

public class Final_Static {

	public static void main(String[] args) {

		Shahar A=new Shahar();
		A.name="Ahilyanagar";
		A.pincode=414300;
		
		Shahar B=new Shahar();
		B.name="Parner";
		B.pincode=414306;
		
		A.showdetails();
		B.showdetails();
		
	}

}
class Shahar
{
	String name;
	int pincode;
	final String state="Maharastra";
	
	public void showdetails()
	{
		System.out.println(name);
		System.out.println(pincode);
		System.out.println(state);
		System.out.println();
	}

}

