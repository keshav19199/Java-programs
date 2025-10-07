//
package java_prog.Classes;

public class Input_SignatureMethod {

	public static void main(String[] args) {
		
		Railway1 rail=new Railway1();
		rail.add(10,20);
		rail.sub(2, 4, 6);
		
		Railway1 rail2=new Railway1();
		rail2.add(40,50);
		rail.sub(50,30,10);
				

	}

}
class Railway1
{
	public void add(double i, int j)
	{
		System.out.println(i+j);
	}
	public void sub(double d1, int d2, double d3)
	{
		System.out.println(d1-d3-d2);
	}
}