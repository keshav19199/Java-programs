package java_prog.challeges.Util;


import java_prog.challeges.Geometry.Circle;
import java_prog.challeges.Geometry.Rectangle;

public class CH_77_Calculator {

	public static void main(String[] args) {

		Circle cir=new Circle(5.5);
		Rectangle rect=new Rectangle(10,5);
		
		double cirArea=Math.PI*Math.pow(cir.radius, 2);
		double rectArea=rect.breadth*rect.length;
		
		System.out.println("Area of Circle is: "+cirArea);
		System.out.println("Area is Rectangle is: "+rectArea);
		
	}
}
