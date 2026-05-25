package java_prog.challeges;

import java.util.Scanner;

public class CH_72_Circle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Circle World..");
		System.out.print("Enter your radius: ");
		double radius=sc.nextDouble();
		
		Circle circle=new Circle(radius);
		
		System.out.println(circle);

			
	}
}
class Circle{
	
	double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	double getCircumference()
	{
		return 2*radius*Math.PI;
	}
	double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString()
	{
		return "Circle Radius: "+radius+", Circumference Area: "+getCircumference()+", Area: "+getArea()+"";
	}
}
