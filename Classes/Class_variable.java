package java_prog.Classes;

public class Class_variable {
	
			public static void main(String[] args) {

				  Plane  boeing=new Plane();
				  boeing.name="Abc1543"; //value Assign
				  boeing.num=145863;
				  boeing.fly();  //call to the method
				  System.out.println(boeing.name);//call to object
				  System.out.println(boeing.num);
				  
				  Plane indigo=new Plane();
				  indigo.name="Xyz16333";
				  indigo.num=793563;
				  indigo.fly();
				  System.out.println(indigo.name);
				  System.out.println(indigo.num);
				  System.out.println("we have done it....");

			}

		}

		class Plane
		{
			String name;//Instance Variable.global access of the variables.
			int num;//Instance varible
			
			//[modifier] returntype methodname
			public void fly()
			{
				int pilots=2;//local varible
				System.out.println("No. of the pilots "+pilots);//local variable access only on the method.
				System.out.println("The Plane is successfully takeoff");
			}
			

}
