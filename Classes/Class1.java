// how to print the class.
package java_prog.Classes;

public class Class1 {

	public static void main(String[] args) {

		int age=21;
		
		System.out.println(age);				//print the main method value direct
		
		System.out.println(new Second().age);	//print the class value. 
		System.out.println(new Second().cars);
	}
}
class Second
{
	int age=30;
	char cars='4';
}