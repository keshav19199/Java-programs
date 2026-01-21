package java_prog.objectMethods;

public class DotEquals {

	public static void main(String[] args) {

		String str="hii";
		String str2="hii";
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.equals(str2));
		System.out.println(str2==str);
		System.out.println("**********************************");
		
		Bike b1=new Bike(9,"Honda",43.34);
		Bike b2=new Bike(9,"Honda",43.34);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
	}

}
class Bike
{
	static int id=43;
	String model;
	double price;
	
//	public int hashcode()
//	{
//		return 65;
//	}
	
	public Bike(int id, String model, double price)
	{
		this.id=id;
		this.model=model;
		this.price=price;
		
	}
	
	public boolean equals(Object obj)
	{
		Bike b=(Bike)obj;
		return this.id==Bike.id  && this.model.equals(obj);
	}
	

}