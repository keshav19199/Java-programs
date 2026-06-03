package java_prog.challeges.CH_83;

public class Square extends Shape {
	
	private final double side;
	
	public Square(double side)
	{
		this.side=side;
	}
	
	public double calculateArea()
	{
		return side*side;
	}

}
