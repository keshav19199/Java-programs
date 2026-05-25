package java_prog.challeges;

public class StringFormat {

	public static void main(String[] args) {

		String name="keshav";
		int marks=43;
		
		System.out.println("Hello,Your name is "+name+" and marks: "+marks);
		
		//printf
		System.out.printf("Hello, tour name is %s and marks: %d\n",name,marks);
		
		//% 13 s give space in line
		System.out.printf("hello %13s \n",name);
		System.out.printf("hello %13S \n",name);
		System.out.printf("hello %0,13d \n",marks);
		System.out.printf("hello %+13d\n",marks);
		System.out.printf("hello %-13d\n",marks);


	}

}
