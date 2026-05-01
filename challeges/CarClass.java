package java_prog.challeges;

public class CarClass {

	public static void main(String[] args) {

		Car c1=new Car();
		Car c2=new Car();
		
		c1.id=2;
		c2.id=3;
		
		c2=c1;
		
		System.out.println(c2.id);
		
	}

}
class Car{
	
	int id;
	
}
