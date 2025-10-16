package java_prog.Classes;

public class Class3 {

	public static void main(String[] args) {

		Car hyundai=new Car();	//create a new object of car
		
		hyundai.milage=40;
		hyundai.price=35000.23;
		
		Car swift=new Car();	//create new object 
		
		swift.milage=45;
		swift.price=75000.769;
		
		System.out.println(hyundai.milage);
		System.out.println(swift.milage);
		
		System.out.println(hyundai.price);
		System.out.println(swift.price);
		
		System.out.println(hyundai==swift);	//=>false because memory address are not same
		
	}

}
class Car
{
	int milage;
	double price;
}
