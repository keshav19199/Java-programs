package java_prog.LambdaExpre;

public class FunctionalInterface {

	public static void main(String[] args) {

		// only one method abstract is called functional interface
		// its work only one abstract method
		
		Demo d=()-> System.out.println("Heloo");
		
		d.show();
	}
}
interface Demo
{
	void show();
}

