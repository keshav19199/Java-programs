package java_prog.challeges.CH_83;

public class TestShape {

	public static void main(String[] args) {

		//Shape sh=new Shape();
		
		Circle c=new Circle(5);
		Square s=new Square(10);
		
		System.out.println("Area of circle: "+c.calculateArea());
		System.out.println("Area of Square: "+s.calculateArea());
		
	}

}
